#!/usr/bin/env python
"""Script that use REST API to find Vendor of MAC Address
"""
import requests

mac = "a8:51:ab:98:8e:52" # your mac address
api_url = f"https://www.macvendorlookup.com/api/v2/{mac}"
try:
    res = requests.get(api_url).json()
    print(f"{mac} - Company: {res[0]['company']}")
except:
    res = f"{mac} not found"
    print(res)

