#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>
#include <sys/types.h>

int send_signal(pid_t pid, int sig){
    kill(pid, sig);
}

int main(int argc, char *argv[]) {
    send_signal(atoi(argv[1]), atoi(argv[2]));
    return 0;
}