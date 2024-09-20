#!/usr/bin/env python

"""script to grap response from "arp -a" 
for a list of MAC addresses and then use
REST API to shoe vendors from all them
"""

import os
import requests


response_arp = os.popen('arp -a').readlines()
print(response_arp)

mac_list = []
for line in response_arp:
    host = line.split(' ')
    for item in host:
        if ":" in item:
            mac_list.append(item)

print(mac_list)


def map_mac_to_company(mac:str) -> str:
    api_url = f"https://www.macvendorlookup.com/api/v2/{mac}"
    try:
        res = requests.get(api_url).json()
        return (f"Company: {res[0]['company']}")
    except:
        return f"{mac} not found"

for mac in mac_list:
    result = map_mac_to_company(mac)
    print(f"{mac} - {result}")
