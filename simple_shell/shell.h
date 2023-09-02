#ifndef _SHELL_H
#define _SHELL_H
#include <unistd.h>
#include <stdio.h>
#include <string.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <stdlib.h>
#include <limits.h>
/*#define delim " /t/r/n/a"*/
#define run 1
int _strlen(char *s);
char *_strdup(char *s);
int _strcmp(char *s1, char s2);
int _atoi(char *s);
char *_itoa(int num);
char **paser(char *str, const char *delim);
int process(char *argv[]);
extern char **environ;
extern char *lineptr;
char *_getline(void);
void prompt(void);
char *checker(char *token);
void execute2(char *cmd, char *argv[], char *envp[]);
void execute(char *cmd, char *argv[], char *envp[]);
#endif
