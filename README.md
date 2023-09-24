# OS Scheduler Simulation
Simulating a Round-Robin scheduling algorithm with Java and Swing.

Quantum = 2s

Meaning that after 2s, if the queue of ready tasks is not empty, the current task is removed from the CPU and the next task in the queue starts to be executed.

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

D - Total Time: 6

D - Total Time: 13

D - Total Time: 12

