#!/usr/bin/python3

import mariadb

conn = mariadb.connect(
    host="localhost",
    user="root",
    password="1719",
    database="Tony",
)
c = conn.cursor()

c.execute("SELECT * FROM taula")

rows = c.fetchall()

for eachRow in rows:
	print(eachRow)
