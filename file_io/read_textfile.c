#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
/**
 * read_textfile - reads a text file and prints it to
 * the POSIX standard output.
 * @filename: the file to read data from.
 * @letters: the number of letters it should read and print.
 * Returns: the number of letters it could read and print.
 */
ssize_t read_textfile(const char *filename, size_t letters)
{
	int fd;
	char buffer[255];
	ssize_t nread;
	ssize_t nwrite;
	size_t total = 0;

	if (filename == NULL)
		return (0);
	fd = open(filename,O_RDONLY);
	if (fd == -1)
	{
		return (0);
	}
	while ((nread = read(fd, buffer, sizeof(buffer))) > 0)
	{
		nwrite = write(1, buffer, nread);
		if (nwrite == -1)
			return (0);
		total += nwrite;
		if (total >= letters)
			break;
	}
	close(fd);
	return (total);
}
/**
 * main - check the code
 *
 * Return: Always 0.
 */
int main(int ac, char **av)
{
    ssize_t n;

    if (ac != 2)
    {
        dprintf(2, "Usage: %s filename\n", av[0]);
        exit(1);
    }
    n = read_textfile(av[1], 114);
    printf("\n(printed chars: %li)\n", n);
    n = read_textfile(av[1], 1024);
    printf("\n(printed chars: %li)\n", n);
    return (0);
}
