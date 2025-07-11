#!/usr/bin/env python
"""Script that use OS module to ping IP Addresses in List and print Results
"""
import os

command = "ping -c 1 "
host_list = ["joelmuhoho.com", "google.com", "192.168.3.1"]
arg = "| grep time="

for host in host_list:
    try:
        response = os.popen(f"{command} {host} {arg}").read()
    except:
        response = ('problem')
    else:
        if response == '':
            response = "no response\n"
    print(f"{host}\n{response}")