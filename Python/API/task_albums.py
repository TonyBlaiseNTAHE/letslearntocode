#!/usr/bin/python3

"""
a script that utilizes the requests library to interact with a REST API

"""
import requests

def fetch_data_from_api():
    url = "https://jsonplaceholder.typicode.com/albums/2"  # Corrected URL
    response = requests.get(url)
    
    if response.status_code == 200:
        data = response.json()
        return data
    else:
        print(f"Failed to fetch data. Status code: {response.status_code}")
        return None

if __name__ == "__main__":
    data = fetch_data_from_api()
    if data:
        print("Data fetched successfully:")
        print(data)

