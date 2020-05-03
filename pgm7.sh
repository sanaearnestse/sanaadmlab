#!/bin/bash
cat /etc/protocols | grep -w 'udp\|idrp\|skip\|ipip'>proto.txt
grep -E0 '[0-9]{1,4}' proto.txt>ans.txt

