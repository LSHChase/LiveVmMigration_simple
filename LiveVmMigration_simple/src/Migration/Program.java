package Migration;

import static Migration.Instructions.*;

public class Program {
	static int code1[]={
			CONST,3,CONST,5,IMUL,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT
	};
	
	static int code6[]={
			READ,1,
			WRITE,1,WRITE,2,WRITE,3,WRITE,4,WRITE,5,WRITE,6,
			WRITE,7,WRITE,8,WRITE,9,WRITE,10,WRITE,11,WRITE,12
		};
	
	static int code2[]={
			CONST,3,CONST,5,IMUL,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,52,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,	
			WRITE,1,READ,10,PRINT,
			WRITE,10,READ,10,PRINT,
			WRITE,50,READ,10,PRINT,
			WRITE,950,READ,10,PRINT,
			WRITE,1,READ,10,PRINT,
			CONST,3,CONST,5,IMUL,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,52,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			WRITE,10,READ,10,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,
			READ,5,READ,3,IADD,PRINT,	
			WRITE,1,READ,10,PRINT,
			WRITE,10,READ,10,PRINT,
			WRITE,50,READ,10,PRINT,
			WRITE,950,READ,10,PRINT,
			WRITE,1,READ,10,PRINT
	};
	
	static int code3[]={
			READ,2,READ,3,IADD,WRITE,5,
			READ,3,READ,3,IADD,WRITE,7,
			READ,7,READ,5,IADD,WRITE,6,
			READ,10,READ,5,IADD,WRITE,6,
			READ,13,READ,4,IADD,WRITE,8,
			READ,10,
			READ,15,READ,5,IADD,WRITE,10,
			READ,16,READ,4,IADD,WRITE,10,	
			READ,15,READ,5,IADD,WRITE,10,
			READ,9,
			READ,18,READ,6,IADD,WRITE,8,
			READ,8,
			READ,8,
			READ,8,
			READ,16,READ,5,IADD,WRITE,9,
			READ,9,
			READ,10,
			READ,17,READ,7,IADD,WRITE,10,
			READ,10,
			READ,10,
			READ,21,READ,10,IADD,WRITE,12,
			READ,14,
			READ,20,READ,11,IADD,WRITE,16,
			READ,22,READ,9,IADD,WRITE,15,
			READ,25,READ,10,IADD,WRITE,17,
			READ,19,
			READ,20,
			READ,21,
			READ,29,READ,11,IADD,WRITE,23,
			READ,22,
			READ,31,READ,10,IADD,WRITE,22,
			READ,34,READ,8,IADD,WRITE,22,
			READ,23,
			READ,24,
			READ,38,READ,5,IADD,WRITE,24,
			READ,41,READ,6,IADD,WRITE,23,
			READ,24,
			READ,41,READ,9,IADD,WRITE,25,
			READ,42,READ,9,IADD,WRITE,26,
			READ,46,READ,10,IADD,WRITE,28,
			READ,29,
			READ,46,READ,12,IADD,WRITE,29,
			READ,31,
			READ,32,
			READ,32,
			READ,49,READ,12,IADD,WRITE,34,
			READ,50,READ,13,IADD,WRITE,36,
			READ,51,READ,14,IADD,WRITE,36,
			READ,53,READ,15,IADD,WRITE,38,
			READ,38,
			READ,55,READ,14,IADD,WRITE,39,
			READ,55,READ,14,IADD,WRITE,41,
			READ,41,
			READ,58,READ,14,IADD,WRITE,42,
			READ,43,
			READ,44,
			READ,60,READ,10,IADD,WRITE,45,
			READ,60,READ,12,IADD,WRITE,46,
			READ,46,
			READ,59,READ,14,IADD,WRITE,46,
			READ,59,READ,16,IADD,WRITE,47,
			READ,62,READ,15,IADD,WRITE,46,
			READ,47,
			READ,69,READ,15,IADD,WRITE,46,
			READ,71,READ,13,IADD,WRITE,47,
			READ,69,READ,14,IADD,WRITE,46,
			READ,47,
			READ,73,READ,15,IADD,WRITE,49,
			READ,76,READ,16,IADD,WRITE,48,
			READ,76,READ,16,IADD,WRITE,48,
			READ,77,READ,15,IADD,WRITE,50,
			READ,50,
			READ,82,READ,16,IADD,WRITE,50,
			READ,85,READ,16,IADD,WRITE,51,
			READ,85,READ,16,IADD,WRITE,51,
			READ,50,
			READ,51,
			READ,51,
			READ,87,READ,18,IADD,WRITE,52,
			READ,52,
			READ,86,READ,15,IADD,WRITE,54,
			READ,53,
			READ,53,
			READ,54,
			READ,55,
			READ,93,READ,11,IADD,WRITE,55,
			READ,92,READ,12,IADD,WRITE,55,
			READ,90,READ,13,IADD,WRITE,56,
			READ,92,READ,15,IADD,WRITE,58,
			READ,60,
			READ,61,
			READ,60,
			READ,62,
			READ,96,READ,18,IADD,WRITE,62,
			READ,61,
			READ,4,READ,20,IADD,WRITE,60,
			READ,7,READ,18,IADD,WRITE,62,
			READ,6,READ,19,IADD,WRITE,62,
			READ,7,READ,21,IADD,WRITE,64,
			READ,65,
			READ,8,READ,22,IADD,WRITE,66,
			READ,66,
			READ,68,
			READ,12,READ,20,IADD,WRITE,70,
			READ,13,READ,21,IADD,WRITE,70,
			READ,13,READ,21,IADD,WRITE,70,
			READ,72,
			READ,14,READ,22,IADD,WRITE,73,
			READ,16,READ,22,IADD,WRITE,73,
			READ,72,
			READ,15,READ,24,IADD,WRITE,74,
			READ,75,
			READ,15,READ,22,IADD,WRITE,76,
			READ,77,
			READ,78,
			READ,77,
			READ,21,READ,21,IADD,WRITE,77,
			READ,23,READ,19,IADD,WRITE,76,
			READ,78,
			READ,24,READ,18,IADD,WRITE,80,
			READ,80,
			READ,80,
			READ,81,
			READ,81,
			READ,31,READ,21,IADD,WRITE,82,
			READ,32,READ,21,IADD,WRITE,83,
			READ,83,
			READ,37,READ,20,IADD,WRITE,83,
			READ,84,
			READ,83,
			READ,84,
			READ,33,READ,18,IADD,WRITE,84,
			READ,83,
			READ,84,
			READ,83,
			READ,84,
			READ,32,READ,17,IADD,WRITE,84,
			READ,35,READ,16,IADD,WRITE,83,
			READ,84,
			READ,39,READ,16,IADD,WRITE,85,
			READ,84,
			READ,40,READ,14,IADD,WRITE,85,
			READ,85,
			READ,86,
			READ,87,
			READ,39,READ,15,IADD,WRITE,87,
			READ,42,READ,13,IADD,WRITE,87,
			READ,86,
			READ,45,READ,12,IADD,WRITE,86,
			READ,43,READ,12,IADD,WRITE,88,
			READ,88,
			READ,47,READ,16,IADD,WRITE,89,
			READ,91,
			READ,47,READ,17,IADD,WRITE,92,
			READ,47,READ,17,IADD,WRITE,93,
			READ,47,READ,17,IADD,WRITE,93,
			READ,49,READ,18,IADD,WRITE,92,
			READ,93,
			READ,93,
			READ,92,
			READ,93,
			READ,95,
			READ,95,
			READ,95,
			READ,55,READ,22,IADD,WRITE,95,
			READ,95,
			READ,97,
			READ,97,
			READ,97,
			READ,60,READ,20,IADD,WRITE,97,
			READ,99,
			READ,62,READ,20,IADD,WRITE,1,
			READ,1,
			READ,64,READ,22,IADD,WRITE,2,
			READ,67,READ,22,IADD,WRITE,4,
			READ,69,READ,23,IADD,WRITE,4,
			READ,72,READ,21,IADD,WRITE,6,
			READ,6,
			READ,73,READ,23,IADD,WRITE,6,
			READ,7,
			READ,9,
			READ,71,READ,26,IADD,WRITE,10,
			READ,73,READ,25,IADD,WRITE,9,
			READ,11,
			READ,11,
			READ,12,
			READ,76,READ,22,IADD,WRITE,14,
			READ,16,
			READ,76,READ,22,IADD,WRITE,16,
			READ,79,READ,24,IADD,WRITE,18,
			READ,20,
			READ,85,READ,24,IADD,WRITE,21,
			READ,20,
			READ,21,
			READ,21,
			READ,22,
			READ,22,
			READ,91,READ,17,IADD,WRITE,22,
			READ,21,
			READ,21,
			READ,89,READ,16,IADD,WRITE,21,
			READ,22,
			READ,23,
			READ,92,READ,17,IADD,WRITE,23,
			READ,94,READ,17,IADD,WRITE,24,
			READ,98,READ,18,IADD,WRITE,26,
			READ,1,READ,18,IADD,WRITE,26,
			READ,0,READ,16,IADD,WRITE,27,
			READ,26,
			READ,25,
			READ,26,
			READ,6,READ,12,IADD,WRITE,26,
			READ,28,
			READ,6,READ,10,IADD,WRITE,29,
			READ,30,
			READ,30,
			READ,30,
			READ,31,
			READ,31,
			READ,32,
			READ,32,
			READ,32,
			READ,33,
			READ,35,
			READ,27,READ,10,IADD,WRITE,34,
			READ,29,READ,8,IADD,WRITE,36,
			READ,30,READ,7,IADD,WRITE,35,
			READ,37,
			READ,31,READ,6,IADD,WRITE,38,
			READ,33,READ,7,IADD,WRITE,37,
			READ,35,READ,6,IADD,WRITE,38,
			READ,34,READ,6,IADD,WRITE,39,
			READ,40,
			READ,36,READ,5,IADD,WRITE,40,
			READ,41,
			READ,41,
			READ,43,
			READ,40,READ,4,IADD,WRITE,42,
			READ,41,READ,2,IADD,WRITE,42,
			READ,44,
			READ,44,
			READ,45,
			READ,44,
			READ,44,
			READ,44,
			READ,46,READ,5,IADD,WRITE,44,
			READ,45,
			READ,46,READ,3,IADD,WRITE,46,
			READ,49,READ,1,IADD,WRITE,48,
			READ,49,
			READ,49,READ,2,IADD,WRITE,51,
			READ,49,READ,3,IADD,WRITE,52,
			READ,49,READ,4,IADD,WRITE,52,
			READ,48,READ,3,IADD,WRITE,52,
			READ,51,READ,3,IADD,WRITE,53,
			READ,55,READ,3,IADD,WRITE,53,
			READ,53,
			READ,54,
			READ,54,
			READ,56,
			READ,64,READ,1,IADD,WRITE,55,
			READ,56,
			READ,66,READ,1,IADD,WRITE,55,
			READ,65,READ,1,IADD,WRITE,55,
			READ,56,
			READ,58,
			READ,70,READ,2,IADD,WRITE,59,
			READ,73,READ,2,IADD,WRITE,58,
			READ,59,
			READ,60,
			READ,80,READ,0,IADD,WRITE,61,
			READ,81,READ,0,IADD,WRITE,61,
			READ,62,
			READ,85,READ,0,IADD,WRITE,61,
			READ,84,READ,0,IADD,WRITE,62,
			READ,84,READ,0,IADD,WRITE,62,
			READ,62,
			READ,63,
			READ,84,READ,1,IADD,WRITE,64,
			READ,65,
			READ,66,
			READ,65,
			READ,65,
			READ,64,
			READ,89,READ,4,IADD,WRITE,65,
			READ,91,READ,3,IADD,WRITE,65,
			READ,92,READ,2,IADD,WRITE,66,
			READ,68,
			READ,69,
			READ,97,READ,4,IADD,WRITE,69,
			READ,96,READ,5,IADD,WRITE,69,
			READ,71,
			READ,98,READ,7,IADD,WRITE,71,
			READ,73,
			READ,73,
			READ,74,
			READ,3,READ,5,IADD,WRITE,75,
			READ,5,READ,5,IADD,WRITE,76,
			READ,76,
			READ,77,
			READ,78,
			READ,78,
			READ,15,READ,6,IADD,WRITE,79,
			READ,14,READ,5,IADD,WRITE,79,
			READ,13,READ,7,IADD,WRITE,80,
			READ,82,
			READ,81,
			READ,14,READ,7,IADD,WRITE,80,
			READ,16,READ,6,IADD,WRITE,81,
			READ,14,READ,7,IADD,WRITE,81,
			READ,16,READ,6,IADD,WRITE,80,
			READ,81,
			READ,83,
			READ,83,
			READ,85,
			READ,84,
			READ,24,READ,3,IADD,WRITE,84,
			READ,24,READ,4,IADD,WRITE,83,
			READ,24,READ,2,IADD,WRITE,83,
			READ,23,READ,0,IADD,WRITE,84,
			READ,26,READ,1,IADD,WRITE,83,
			READ,83,
			READ,27,READ,2,IADD,WRITE,84,
			READ,25,READ,1,IADD,WRITE,85,
			READ,27,READ,3,IADD,WRITE,85,
			READ,27,READ,2,IADD,WRITE,87,
			READ,28,READ,1,IADD,WRITE,87,
			READ,31,READ,1,IADD,WRITE,89,
			READ,90,
			READ,91,
			READ,39,READ,1,IADD,WRITE,91,
			READ,90,
			READ,36,READ,0,IADD,WRITE,91,
			READ,34,READ,1,IADD,WRITE,90,
			READ,92,
			READ,91,
			READ,90,
			READ,90,
			READ,40,READ,2,IADD,WRITE,90,
			READ,43,READ,3,IADD,WRITE,91,
			READ,93,
			READ,94,
			READ,93,
			READ,93,
			READ,94,
			READ,96,
			READ,52,READ,1,IADD,WRITE,96,
			READ,54,READ,3,IADD,WRITE,98,
			READ,99,
			READ,1,
			READ,0,
			READ,0,
			READ,1,
			READ,66,READ,2,IADD,WRITE,1,
			READ,2,
			READ,2,
			READ,71,READ,0,IADD,WRITE,2,
			READ,2,
			READ,75,READ,0,IADD,WRITE,2,
			READ,79,READ,0,IADD,WRITE,1,
			READ,80,READ,0,IADD,WRITE,1,
			READ,82,READ,2,IADD,WRITE,1,
			READ,83,READ,0,IADD,WRITE,1,
			READ,1,
			READ,3,
			READ,4,
			READ,3,
			READ,80,READ,1,IADD,WRITE,4,
			READ,5,
			READ,85,READ,3,IADD,WRITE,5,
			READ,87,READ,2,IADD,WRITE,5,
			READ,88,READ,0,IADD,WRITE,7,
			READ,7,
			READ,91,READ,0,IADD,WRITE,8,
			READ,9,
			READ,11,
			READ,12,
			READ,11,
			READ,12,
			READ,11,
			READ,12,
			READ,14,
			READ,14,
			READ,5,READ,1,IADD,WRITE,14,
			READ,13,
			READ,13,
			READ,1,READ,1,IADD,WRITE,13,
			READ,0,READ,0,IADD,WRITE,14,
			READ,15,
			READ,15,
			READ,16,
			READ,2,READ,2,IADD,WRITE,16,
			READ,1,READ,1,IADD,WRITE,16,
			READ,17,
			READ,16,
			READ,17,
			READ,18,
			READ,1,READ,1,IADD,WRITE,17,
			READ,3,READ,2,IADD,WRITE,18,
			READ,3,READ,2,IADD,WRITE,18,
			READ,19,
			READ,7,READ,1,IADD,WRITE,19,
			READ,7,READ,2,IADD,WRITE,21,
			READ,21,
			READ,21,
			READ,13,READ,2,IADD,WRITE,22,
			READ,22,
			READ,24,
			READ,12,READ,0,IADD,WRITE,26,
			READ,26,
			READ,13,READ,0,IADD,WRITE,26,
			READ,27,
			READ,28,
			READ,16,READ,3,IADD,WRITE,29,
			READ,15,READ,3,IADD,WRITE,30,
			READ,31,
			READ,14,READ,1,IADD,WRITE,32,
			READ,32,
			READ,32,
			READ,12,READ,1,IADD,WRITE,31,
			READ,32,
			READ,16,READ,2,IADD,WRITE,33,
			READ,16,READ,1,IADD,WRITE,35,
			READ,14,READ,3,IADD,WRITE,36,
			READ,14,READ,2,IADD,WRITE,38,
			READ,15,READ,3,IADD,WRITE,38,
			READ,38,
			READ,40,
			READ,41,
			READ,42,
			READ,16,READ,4,IADD,WRITE,41,
			READ,42,
			READ,18,READ,4,IADD,WRITE,41,
			READ,42,
			READ,18,READ,4,IADD,WRITE,43,
			READ,19,READ,5,IADD,WRITE,42,
			READ,22,READ,5,IADD,WRITE,42,
			READ,42,
			READ,41,
			READ,41,
			READ,41,
			READ,41,
			READ,40,
			READ,34,READ,1,IADD,WRITE,40,
			READ,33,READ,2,IADD,WRITE,42,
			READ,34,READ,2,IADD,WRITE,43,
			READ,33,READ,2,IADD,WRITE,45,
			READ,34,READ,2,IADD,WRITE,46,
			READ,35,READ,0,IADD,WRITE,46,
			READ,38,READ,1,IADD,WRITE,47,
			READ,49,
			READ,39,READ,4,IADD,WRITE,49,
			READ,49,
			READ,38,READ,4,IADD,WRITE,49,
			READ,49,
			READ,42,READ,4,IADD,WRITE,48,
			READ,45,READ,4,IADD,WRITE,49,
			READ,49,READ,4,IADD,WRITE,49,
			READ,51,READ,3,IADD,WRITE,49,
			READ,52,READ,2,IADD,WRITE,49,
			READ,51,READ,4,IADD,WRITE,49,
			READ,49,
			READ,50,
			READ,52,READ,3,IADD,WRITE,49,
			READ,50,
			READ,55,READ,1,IADD,WRITE,50,
			READ,56,READ,1,IADD,WRITE,50,
			READ,52,
			READ,51,
			READ,52,
			READ,58,READ,2,IADD,WRITE,53,
			READ,57,READ,1,IADD,WRITE,54,
			READ,55,
			READ,58,READ,2,IADD,WRITE,55,
			READ,61,READ,2,IADD,WRITE,55,
			READ,55,
			READ,56,
			READ,58,
			READ,59,
			READ,60,
			READ,65,READ,6,IADD,WRITE,60,
			READ,66,READ,5,IADD,WRITE,60,
			READ,61,
			READ,62,
			READ,72,READ,7,IADD,WRITE,63,
			READ,75,READ,6,IADD,WRITE,64,
			READ,64,
			READ,74,READ,6,IADD,WRITE,65,
			READ,64,
			READ,77,READ,3,IADD,WRITE,65,
			READ,79,READ,3,IADD,WRITE,66,
			READ,81,READ,1,IADD,WRITE,67,
			READ,80,READ,0,IADD,WRITE,67,
			READ,69,
			READ,68,
			READ,82,READ,3,IADD,WRITE,69,
			READ,82,READ,1,IADD,WRITE,71,
			READ,83,READ,1,IADD,WRITE,70,
			READ,82,READ,0,IADD,WRITE,70,
			READ,83,READ,0,IADD,WRITE,72,
			READ,73,
			READ,74,
			READ,90,READ,2,IADD,WRITE,76,
			READ,90,READ,4,IADD,WRITE,75,
			READ,91,READ,3,IADD,WRITE,74,
			READ,76,
			READ,76,
			READ,87,READ,1,IADD,WRITE,76,
			READ,75,
			READ,86,READ,3,IADD,WRITE,77,
			READ,87,READ,3,IADD,WRITE,79,
			READ,90,READ,2,IADD,WRITE,80,
			READ,81,
			READ,80,
			READ,81,
			READ,81,
			READ,80,
			READ,98,READ,1,IADD,WRITE,81,
			READ,1,READ,2,IADD,WRITE,80,
			READ,3,READ,2,IADD,WRITE,81,
			READ,80,
			READ,79,
			READ,79,
			READ,79,
			READ,14,READ,2,IADD,WRITE,81,
			READ,18,READ,1,IADD,WRITE,80,
			READ,17,READ,2,IADD,WRITE,80,
			READ,81,
			READ,18,READ,1,IADD,WRITE,82,
			READ,81,
			READ,16,READ,4,IADD,WRITE,80,
			READ,14,READ,4,IADD,WRITE,81,
			READ,16,READ,5,IADD,WRITE,81,
			READ,80,
			READ,22,READ,5,IADD,WRITE,79,
			READ,80,
			READ,24,READ,5,IADD,WRITE,81,
			READ,25,READ,5,IADD,WRITE,83,
			READ,84,
			READ,25,READ,4,IADD,WRITE,85,
			READ,26,READ,4,IADD,WRITE,86,
			READ,30,READ,3,IADD,WRITE,88,
			READ,29,READ,2,IADD,WRITE,88,
			READ,90,
			READ,92,
			READ,38,READ,2,IADD,WRITE,94,
			READ,39,READ,0,IADD,WRITE,93,
			READ,38,READ,0,IADD,WRITE,92,
			READ,93,
			READ,38,READ,2,IADD,WRITE,94,
			READ,94,
			READ,39,READ,2,IADD,WRITE,94,
			READ,94,
			READ,95,
			READ,40,READ,2,IADD,WRITE,95,
			READ,97,
			READ,97,
			READ,98,
			READ,99,
			READ,1,
			READ,43,READ,4,IADD,WRITE,0,
			READ,1,
			READ,0,
			READ,46,READ,6,IADD,WRITE,2,
			READ,3,
			READ,47,READ,9,IADD,WRITE,5,
			READ,51,READ,9,IADD,WRITE,5,
			READ,6,
			READ,7,
			READ,6,
			READ,7,
			READ,60,READ,8,IADD,WRITE,7,
			READ,7,
			READ,62,READ,8,IADD,WRITE,8,
			READ,9,
			READ,10,
			READ,66,READ,3,IADD,WRITE,9,
			READ,10,
			READ,72,READ,2,IADD,WRITE,9,
			READ,76,READ,4,IADD,WRITE,8,
			READ,9,
			READ,11,
			READ,11,
			READ,13,
			READ,14,
			READ,79,READ,5,IADD,WRITE,16,
			READ,17,
			READ,17,
			READ,83,READ,6,IADD,WRITE,16,
			READ,17,
			READ,84,READ,5,IADD,WRITE,19,
			READ,19,
			READ,21,
			READ,89,READ,3,IADD,WRITE,22,
			READ,23,
			READ,24,
			READ,89,READ,4,IADD,WRITE,24,
			READ,91,READ,5,IADD,WRITE,24,
			READ,25,
			READ,27,
			READ,28,
			READ,30,
			READ,30,
			READ,93,READ,5,IADD,WRITE,31,
			READ,94,READ,5,IADD,WRITE,33,
			READ,34,
			READ,94,READ,6,IADD,WRITE,36,
			READ,35,
			READ,35,
			READ,94,READ,8,IADD,WRITE,36,
			READ,35,
			READ,36,
			READ,96,READ,10,IADD,WRITE,36,
			READ,36,
			READ,1,READ,8,IADD,WRITE,37,
			READ,3,READ,9,IADD,WRITE,36,
			READ,5,READ,8,IADD,WRITE,35,
			READ,37,
			READ,37,
			READ,39,
			READ,6,READ,11,IADD,WRITE,38,
			READ,37,
			READ,36,
			READ,13,READ,7,IADD,WRITE,36,
			READ,14,READ,8,IADD,WRITE,37,
			READ,37,
			READ,14,READ,10,IADD,WRITE,38,
			READ,15,READ,8,IADD,WRITE,39,
			READ,39,
			READ,39,
			READ,41,
			READ,41,
			READ,43,
			READ,18,READ,12,IADD,WRITE,44,
			READ,20,READ,10,IADD,WRITE,43,
			READ,24,READ,10,IADD,WRITE,43,
			READ,25,READ,9,IADD,WRITE,45,
			READ,46,
			READ,48,
			READ,50,
			READ,28,READ,10,IADD,WRITE,51,
			READ,26,READ,10,IADD,WRITE,52,
			READ,25,READ,12,IADD,WRITE,51,
			READ,51,
			READ,51,
			READ,28,READ,14,IADD,WRITE,51,
			READ,50,
			READ,32,READ,16,IADD,WRITE,49,
			READ,51,
			READ,50,
			READ,51,
			READ,34,READ,15,IADD,WRITE,52,
			READ,36,READ,14,IADD,WRITE,53,
			READ,35,READ,14,IADD,WRITE,54,
			READ,37,READ,16,IADD,WRITE,53,
			READ,53,
			READ,36,READ,18,IADD,WRITE,55,
			READ,40,READ,18,IADD,WRITE,54,
			READ,53,
			READ,54,
			READ,54,
			READ,43,READ,20,IADD,WRITE,53,
			READ,54,
			READ,54,
			READ,55,
			READ,49,READ,16,IADD,WRITE,55,
			READ,49,READ,16,IADD,WRITE,56,
			READ,56,
			READ,56,
			READ,52,READ,16,IADD,WRITE,56,
			READ,52,READ,16,IADD,WRITE,55,
			READ,53,READ,16,IADD,WRITE,54,
			READ,56,READ,17,IADD,WRITE,55,
			READ,54,READ,17,IADD,WRITE,57,
			READ,58,
			READ,60,
			READ,58,READ,16,IADD,WRITE,61,
			READ,63,
			READ,61,READ,17,IADD,WRITE,62,
			READ,61,
			READ,62,
			READ,61,
			READ,62,
			READ,62,
			READ,62,
			READ,61,
			READ,63,
			READ,63,
			READ,66,READ,20,IADD,WRITE,63,
			READ,62,
			READ,73,READ,22,IADD,WRITE,63,
			READ,73,READ,23,IADD,WRITE,65,
			READ,65,
			READ,64,
			READ,64,
			READ,63,
			READ,78,READ,23,IADD,WRITE,63,
			READ,77,READ,21,IADD,WRITE,65,
			READ,64,
			READ,63,
			READ,79,READ,21,IADD,WRITE,64,
			READ,78,READ,23,IADD,WRITE,66,
			READ,66,
			READ,67,
			READ,82,READ,23,IADD,WRITE,68,
			READ,84,READ,23,IADD,WRITE,68,
			READ,87,READ,23,IADD,WRITE,69,
			READ,87,READ,25,IADD,WRITE,69,
			READ,89,READ,27,IADD,WRITE,70,
			READ,91,READ,25,IADD,WRITE,70,
			READ,90,READ,23,IADD,WRITE,69,
			READ,93,READ,23,IADD,WRITE,68,
			READ,69,
			READ,91,READ,22,IADD,WRITE,70,
			READ,72,
			READ,72,
			READ,71,
			READ,1,READ,20,IADD,WRITE,70,
			READ,1,READ,18,IADD,WRITE,71,
			READ,3,READ,20,IADD,WRITE,71,
			READ,6,READ,18,IADD,WRITE,72,
			READ,73,
			READ,74,
			READ,3,READ,17,IADD,WRITE,74,
			READ,73,
			READ,7,READ,17,IADD,WRITE,73,
			READ,11,READ,17,IADD,WRITE,74,
			READ,13,READ,19,IADD,WRITE,74,
			READ,16,READ,17,IADD,WRITE,73,
			READ,19,READ,18,IADD,WRITE,73,
			READ,74,
			READ,18,READ,21,IADD,WRITE,75,
			READ,19,READ,20,IADD,WRITE,77,
			READ,21,READ,19,IADD,WRITE,78,
			READ,25,READ,21,IADD,WRITE,79,
			READ,28,READ,23,IADD,WRITE,79,
			READ,79,
			READ,32,READ,22,IADD,WRITE,79,
			READ,81,
			READ,83,
			READ,84,
			READ,37,READ,24,IADD,WRITE,85,
			READ,84,
			READ,86,
			READ,87,
			READ,89,
			READ,90,
			READ,46,READ,25,IADD,WRITE,89,
			READ,91,
			READ,93,
			READ,93,
			READ,55,READ,25,IADD,WRITE,95,
			READ,95,
			READ,96,
			READ,63,READ,26,IADD,WRITE,97,
			READ,65,READ,25,IADD,WRITE,96,
			READ,96,
			READ,71,READ,26,IADD,WRITE,96,
			READ,70,READ,27,IADD,WRITE,96,
			READ,97,
			READ,99,
			READ,81,READ,25,IADD,WRITE,1,
			READ,80,READ,24,IADD,WRITE,2,
			READ,82,READ,23,IADD,WRITE,2,
			READ,84,READ,22,IADD,WRITE,1,
			READ,0,
			READ,1,
			READ,86,READ,19,IADD,WRITE,1,
			READ,88,READ,19,IADD,WRITE,3,
			READ,3,
			READ,88,READ,20,IADD,WRITE,4,
			READ,90,READ,18,IADD,WRITE,4,
			READ,5,
			READ,5,
			READ,91,READ,19,IADD,WRITE,6,
			READ,7,
			READ,94,READ,21,IADD,WRITE,6,
			READ,6,
			READ,7,
			READ,92,READ,23,IADD,WRITE,9,
			READ,90,READ,23,IADD,WRITE,9,
			READ,90,READ,23,IADD,WRITE,11,
			READ,90,READ,23,IADD,WRITE,12,
			READ,89,READ,22,IADD,WRITE,13,
			READ,92,READ,22,IADD,WRITE,15,
			READ,15,
			READ,96,READ,22,IADD,WRITE,15,
			READ,95,READ,21,IADD,WRITE,17,
			READ,95,READ,20,IADD,WRITE,18,
			READ,18,
			READ,20,
			READ,98,READ,21,IADD,WRITE,21,
			READ,96,READ,20,IADD,WRITE,22,
			READ,21,
			READ,96,READ,23,IADD,WRITE,23,
			READ,97,READ,24,IADD,WRITE,24,
			READ,24,
			READ,24,
			READ,24,
			READ,25,
			READ,25,
			READ,24,
			READ,5,READ,27,IADD,WRITE,26,
			READ,26,
			READ,25,
			READ,25,
			READ,12,READ,29,IADD,WRITE,24,
			READ,23,
			READ,14,READ,33,IADD,WRITE,25,
			READ,27,
			READ,18,READ,30,IADD,WRITE,29,
			READ,29,
			READ,31,
			READ,16,READ,32,IADD,WRITE,33,
			READ,14,READ,33,IADD,WRITE,33,
			READ,35,
			READ,18,READ,32,IADD,WRITE,36,
			READ,37,
			READ,38,
			READ,39,
			READ,26,READ,32,IADD,WRITE,40,
			READ,42,
			READ,43,
			READ,28,READ,32,IADD,WRITE,43,
			READ,31,READ,31,IADD,WRITE,44,
			READ,43,
			READ,31,READ,29,IADD,WRITE,44,
			READ,44,
			READ,44,
			READ,37,READ,31,IADD,WRITE,43,
			READ,39,READ,32,IADD,WRITE,43,
			READ,41,READ,31,IADD,WRITE,44,
			READ,43,
			READ,41,READ,31,IADD,WRITE,43,
			READ,45,
			READ,46,
			READ,44,READ,30,IADD,WRITE,48,
			READ,50,
			READ,47,READ,31,IADD,WRITE,49,
			READ,48,
			READ,48,READ,33,IADD,WRITE,48,
			READ,49,READ,33,IADD,WRITE,49,
			READ,49,
			READ,51,
			READ,51,
			READ,47,READ,32,IADD,WRITE,50,
			READ,49,
			READ,49,
			READ,53,READ,34,IADD,WRITE,50,
			READ,53,READ,33,IADD,WRITE,51,
			READ,51,
			READ,54,READ,33,IADD,WRITE,51,
			READ,54,READ,34,IADD,WRITE,52,
			READ,51,
			READ,54,READ,34,IADD,WRITE,53,
			READ,53,READ,34,IADD,WRITE,54,
			READ,56,
			READ,56,
			READ,61,READ,35,IADD,WRITE,57,
			READ,58,
			READ,57,
			READ,56,
			READ,55,
			READ,64,READ,32,IADD,WRITE,55,
			READ,63,READ,31,IADD,WRITE,57,
			READ,59,
			READ,66,READ,32,IADD,WRITE,59,
			READ,61,
			READ,66,READ,30,IADD,WRITE,63,
			READ,64,
			READ,65,
			READ,68,READ,31,IADD,WRITE,65,
			READ,67,READ,32,IADD,WRITE,66,
			READ,68,READ,32,IADD,WRITE,67,
			READ,66,READ,33,IADD,WRITE,66,
			READ,66,READ,34,IADD,WRITE,66,
			READ,66,
			READ,66,READ,31,IADD,WRITE,65,
			READ,67,READ,29,IADD,WRITE,64,
			READ,63,
			READ,63,
			READ,70,READ,27,IADD,WRITE,62,
			READ,62,
			READ,62,
			READ,63,
			READ,80,READ,32,IADD,WRITE,63,
			READ,62,
			READ,82,READ,34,IADD,WRITE,63,
			READ,64,
			READ,65,
			READ,66,
			READ,83,READ,37,IADD,WRITE,66,
			READ,83,READ,36,IADD,WRITE,66,
			READ,84,READ,38,IADD,WRITE,66,
			READ,65,
			READ,65,
			READ,65,
			READ,88,READ,43,IADD,WRITE,66,
			READ,66,
			READ,93,READ,44,IADD,WRITE,67,
			READ,93,READ,44,IADD,WRITE,66,
			READ,94,READ,44,IADD,WRITE,67,
			READ,67,
			READ,94,READ,47,IADD,WRITE,68,
			READ,68,
			READ,67,
			READ,92,READ,50,IADD,WRITE,67,
			READ,66,
			READ,98,READ,50,IADD,WRITE,66,
			READ,1,READ,48,IADD,WRITE,65,
			READ,2,READ,48,IADD,WRITE,64,
			READ,4,READ,48,IADD,WRITE,65,
			READ,4,READ,48,IADD,WRITE,65,
			READ,67,
			READ,67,
			READ,12,READ,46,IADD,WRITE,68,
			READ,12,READ,45,IADD,WRITE,69,
			READ,12,READ,46,IADD,WRITE,71,
			READ,70,
			READ,72,
			READ,72,
			READ,73,
			READ,20,READ,45,IADD,WRITE,74,
			READ,23,READ,46,IADD,WRITE,74,
			READ,75,
			READ,74,
			READ,27,READ,46,IADD,WRITE,74,
			READ,29,READ,45,IADD,WRITE,74,
			READ,30,READ,43,IADD,WRITE,75,
			READ,74,
			READ,74,
			READ,37,READ,43,IADD,WRITE,75,
			READ,37,READ,45,IADD,WRITE,74,
			READ,38,READ,44,IADD,WRITE,76,
			READ,75,
			READ,41,READ,43,IADD,WRITE,76,
			READ,41,READ,42,IADD,WRITE,78,
			READ,80,
			READ,80,
			READ,79,
			READ,78,
			READ,47,READ,43,IADD,WRITE,78,
			READ,79,
			READ,51,READ,40,IADD,WRITE,79,
			READ,53,READ,40,IADD,WRITE,80,
			READ,79,
			READ,81,
			READ,53,READ,40,IADD,WRITE,80,
			READ,56,READ,40,IADD,WRITE,81,
			READ,82,
			READ,52,READ,41,IADD,WRITE,81,
			READ,82,
			READ,84,
			READ,54,READ,44,IADD,WRITE,85,
			READ,86,
			READ,55,READ,43,IADD,WRITE,86,
			READ,85,
			READ,59,READ,39,IADD,WRITE,86,
			READ,62,READ,41,IADD,WRITE,86,
			READ,61,READ,39,IADD,WRITE,86,
			READ,61,READ,40,IADD,WRITE,87,
			READ,88,
			READ,65,READ,39,IADD,WRITE,89,
			READ,89,
			READ,63,READ,40,IADD,WRITE,89,
			READ,91,
			READ,92,
			READ,94,
			READ,94,
			READ,94,
			READ,95,
			READ,95,
			READ,95,
			READ,74,READ,47,IADD,WRITE,96,
			READ,97,
			READ,77,READ,46,IADD,WRITE,98,
			READ,77,READ,46,IADD,WRITE,98,
			READ,99,
			READ,99,
			READ,85,READ,43,IADD,WRITE,1,
			READ,89,READ,44,IADD,WRITE,3,
			READ,5,
			READ,6,
			READ,6,
			READ,92,READ,46,IADD,WRITE,6,
			READ,93,READ,46,IADD,WRITE,8,
			READ,93,READ,46,IADD,WRITE,8,
			READ,95,READ,46,IADD,WRITE,7,
			READ,8,
			READ,98,READ,46,IADD,WRITE,9,
			READ,1,READ,47,IADD,WRITE,9,
			READ,10,
			READ,4,READ,47,IADD,WRITE,12,
			READ,5,READ,45,IADD,WRITE,11,
			READ,7,READ,45,IADD,WRITE,13,
			READ,13,
			READ,12,
			READ,10,READ,48,IADD,WRITE,12,
			READ,10,READ,48,IADD,WRITE,13,
			READ,15
	};

}
