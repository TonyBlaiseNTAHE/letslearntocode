# This is a study about function pointers in c.
 1) Unlike normal pointers, a function pointer points to code, not data. Typically a function pointer
stores the start of executable code.
2) Unlike normal pointers, we do not allocate de-allocate memory using function pointers.
3) A function's name can also be used to get functions'address. For example, in ~fun2.c~program,
we have removed address operator ~&~ in assignement. We have also changed function call by removing ~*~,
the program still works.
4) Like normal pointers, we have an array of function pointers.
5) Function pointer can be used in place of switch case. see ~fun3.c~.
6) Like normal data pointers , a function pointer can be passed as an argument and can also be returned
from a function.

