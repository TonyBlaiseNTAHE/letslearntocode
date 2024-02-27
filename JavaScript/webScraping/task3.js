#!/usr/bin/node

/**
 * A script that scrap a id into an API
*/
const request = require('request');

const url = process.argv[2];

request(url, function (err, response, body) {
	if (err)
	{
		console.log(err);
		return;
	}
	console.log(response.statusCode);
});
