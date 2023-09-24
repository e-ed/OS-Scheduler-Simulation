# OS Scheduler Simulation
Simulating a Round-Robin scheduling algorithm with Java and Swing.

Quantum = 2s

Meaning that after 2s, if the queue of ready tasks is not empty, the current task is removed from the CPU and the next task in the queue starts to be executed.

A new task is read from the text file every 5 seconds.

## Tasks duration:

A - 1 second

B - 2 seconds

C - 3 seconds

D - 4 seconds

## Text file with tasks
Text file with a queue of tasks. The user is prompted to select this file from their computer.


Example:

DDDDBCA

ABCBA

(they can span multiple lines as well)

## taskResults.txt
Text file where the total running time for each task is saved after execution is done.

Example:

Quantum Length: 2s 

D - Total Time: 4

D - Total Time: 11

D - Total Time: 10

B - Total Time: 8

D - Total Time: 21

A - Total Time: 9

C - Total Time: 17

A - Total Time: 10

B - Total Time: 9

B - Total Time: 7

C - Total Time: 15

A - Total Time: 8

