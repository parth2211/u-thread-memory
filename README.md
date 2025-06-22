# u-thread-memory
Thread Private Stack and Shared Heap

Thread Stack is private memory for a thread data
If threads are sharing a common resource, then the same ref is present in both
of its stacks and hence if one thread updates the ref, other gets changed value. (We are now with RACE Confitions)

//Here we implemented two Counter running by diff threads, but sharing common countdown variable

