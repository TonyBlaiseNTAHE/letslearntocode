#!/usr/bin/env bash

# define the log file path
LOG_FILE="/var/log/custom_daemon.log"

# Infinite loop to run the daemon
while true
do
	# Get the current timestand
	TIMESTAMP=$(date +"%Y-%m-%d %T")

	#log a message to the file with the timestamp
	echo "Daemon is running at $TIMESTAMP" >> $LOG_FILE

	# Sleep for 5 seconds before the next iteration
	sleep 5
done
