// example.c
//
// gcc example.c -lssl -lcrypto -o example

#include <openssl/evp.h>
#include <stdio.h>
#include <string.h>

void bytes2md5(const char *data, int len, char *md5buf) {
  // Based on https://www.openssl.org/docs/manmaster/man3/EVP_DigestUpdate.html
  EVP_MD_CTX *mdctx = EVP_MD_CTX_new();
  const EVP_MD *md = EVP_md5();
  unsigned char md_value[EVP_MAX_MD_SIZE];
  unsigned int md_len, i;
  EVP_DigestInit_ex(mdctx, md, NULL);
  EVP_DigestUpdate(mdctx, data, len);
  EVP_DigestFinal_ex(mdctx, md_value, &md_len);
  EVP_MD_CTX_free(mdctx);
  for (i = 0; i < md_len; i++) {
    snprintf(&(md5buf[i * 2]), 16 * 2, "%02x", md_value[i]);
  }
}

int main(void) {
  const char *hello = "hola";
  char md5[33]; // 32 characters + null terminator
  bytes2md5(hello, strlen(hello), md5);
  printf("%s\n", md5);
}