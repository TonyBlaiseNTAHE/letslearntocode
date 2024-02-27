#!/usr/bin/node

/**
 * a script that reads and prints the content of a file
 */

// importing fs
const fs = require('fs');

const fileName = process.argv[2];
fs.readFile(fileName, 'utf-8', (err, data) => {
  if (err) {
    console.error("Can't not read", err);
    return;
  }
  console.log(data);
});
