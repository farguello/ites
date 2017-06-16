package pack1;

import java.util.Arrays;
import java.util.Stack;

public class Tests {
	
	public int[] inputArray;
	public int[][] inputMatrix;
	
	public Tests(){
		
	}
	
	public Tests(int[] inputArray){
		this.inputArray = inputArray;
	}
	public Tests(int[][] inputMatrix){
		this.inputMatrix = inputMatrix;
	}
	
	public int adjacentElementsProduct(int[] inputArray) {
	    int superProduct = 0;
	    int actualProduct = 0;
	    for (int i=0; i < inputArray.length-1; i++){
	        if (i == 0){
	        	superProduct = inputArray[i] * inputArray[i+1];
	        }
            actualProduct = inputArray[i] * inputArray[i+1];
            if (actualProduct > superProduct){
                superProduct = actualProduct;
                System.out.println(superProduct);
            }
            else{
            }
	    }
	    
	    return superProduct;
	}
	
	public int makeArrayConsecutive2(int[] statues) {
	    
	    int min = statues[0];
	    int max = statues[0];
	    int missing = 0;
	    boolean hay = false;
	    
	    for (int i = 0; i < statues.length ; i++){
	        if (min > statues[i]){
	            min = statues[i];
	            System.out.println("Minimo: " + min);
	        }
	        if (max < statues[i]){
	            max = statues[i];
	            System.out.println("Maximo: " + max);
	        }
	    }
	    
	    min++;
	    System.out.println("Minimo a probar: " + min);
	    max--;
	    System.out.println("Maximo a probar: " + max);
	    System.out.println();
	    
	    while (min <= max) {
	        for (int i = 0; i < statues.length; i++){
	        	System.out.println("Analizo " + min + " en statues[" + i + "]:");
	        	System.out.println("Statues[" + i + "] = " + statues[i]);
	        	if (statues[i] == min){
	        		System.out.println("Son el mismo numero.");
	        		hay = true;
	        		System.out.println("Se cambió a true el 'hay'.");
	        		System.out.println();
	        	}
	        	else{
	        		System.out.println("No son el mismo numero.");
	        		System.out.println();
	        	}
	        }
	        if (!hay){
	        	missing++;
	        }
	        else {
	        	hay = false;
	        }
	        min++;
	    }
	    return missing;
	}
	
	boolean almostIncreasingSequence(int[] sequence) {
		
		int rep = 0;
		int decreasing = 0;
		int minValue = sequence[0];
		int maxValue = sequence[0];
		int lastMax = 0;
		boolean elim = false;
		
		System.out.println("Máximo: " + maxValue);
		System.out.println("Mínimo: " + minValue);
		System.out.println();
		
		for (int i = 0; i < sequence.length; i++){
			
			System.out.println("Posicion de arreglo: " + i);
			System.out.println("Analizando numero: " + sequence[i]);
			
			if ((sequence[i] == maxValue || sequence[i] == minValue) && i != 0){
				System.out.println("Se detectó numero repetido.");
				rep++;
			}
			
			if (sequence[i] > maxValue){
				lastMax = maxValue;
				maxValue = sequence[i];
				System.out.println("Se detectó número máximo: " + maxValue);
			}
			else if (sequence[i] < minValue){
				minValue = sequence[i];
				System.out.println("Se detectó número mínimo: " + minValue);
			}
			else{
				System.out.println("No hay cambios.");
			}
			
			if (i+1 < sequence.length){
				if (sequence[i+1] <= maxValue){
					System.out.println("No es creciente, siguiente numero: " + sequence[i+1]);
					if (!elim){
						maxValue = Integer.MIN_VALUE;
						elim = true;
					}
					decreasing++;
				}
			}
			
			System.out.println("Cantidad de iguales: " + rep);
			System.out.println("Cantidad de decrecientes: " + decreasing);
			System.out.println("Último máximo conocido: " + lastMax);
			System.out.println("Max: " + maxValue);
			System.out.println("Min: " + minValue);
			System.out.println();
		}
		
		if (rep > 0 || decreasing > 1){
			return false;
		}
		
		return true;
		
		
	}
	
	int matrixElementsSum(int[][] matrix) {
	    int totalSum = 0;
	    
	    for (int j=0; j < matrix[0].length ; j++){
	        for (int i=0; i < matrix.length ; i++){
	        	System.out.println("Analizando ["+i+"]["+j+"]");
	        	System.out.println("Numero almacenado: " + matrix[i][j]);
	        	System.out.println();
	        	if (matrix[i][j] != 0){
	                totalSum += matrix[i][j];
	                System.out.println("Se suma al total: " + totalSum);
	                System.out.println();
	            }
	            else {
	            	
	            	if (j == matrix[0].length -1){
	            		return totalSum;
	            	}
	            	if (j+1 != matrix[0].length){
		                j++;
		                i = -1;
		                System.out.println("No se suma y se saltea a la columna j = " + j);
		                System.out.println("i vuelve a = " + i);
		                System.out.println();
	            	}
	            }
	        }
	    }
	    
	    return totalSum;
	}
	
	String[] allLongestStrings(String[] inputArray) {
	    int longestString = inputArray[0].length();
	    int index = 0;
	    int cant = 0;
	    
	    for (int i = 0; i < inputArray.length; i++){
	        if (inputArray[i].length() == longestString){
	        	cant++;
	        }
	    	if (inputArray[i].length() > longestString){
	            longestString = inputArray[i].length();
	            cant = 1;
	        }
	    }
	    
	    String[] newArray = new String[cant];
	    
	    for (int i = 0; i < inputArray.length; i++){
	        if (inputArray[i].length() == longestString){
	            newArray[index] = inputArray[i];
	            index++;
	        }
	    }
	    
	    return newArray;
	    
	}

	int commonCharacterCount(String s1, String s2) {
	    int commonCount = 0;
	    String subSet;
	    
	    for (int i = 0; i < s1.length(); i++){
	        for (int j = 0; j < s2.length(); j++){
	        	System.out.println("Analizando: " + s1.charAt(i));
            	System.out.println("Contra: " + s2.charAt(j));
            	System.out.println();
	            if (s1.charAt(i) == s2.charAt(j)){
	                commonCount++;
	                subSet = s2.substring(0,j) + '-' + s2.substring(j+1);
	                s2 = subSet;
	            	System.out.println("Son iguales. Sumando a contador: " + commonCount);
	            	System.out.println("Eliminando coincidencia. s2 ahora es: '" + s2 + "'");
	            	System.out.println();
	                break;
	            }            
	        }
	    }
	    
	    return commonCount;
	}
	
	boolean isLucky(int n) {
	    
	    int aux = n;
	    
	    int rest = 0;
	    
	    int totalSum1 = 0;
	    int totalSum2 = 0;
	    
	    int reps = 0;
	    int digitsCount = 1;
	    
	    while (aux > 0){
	        aux = aux/10;
	        reps++;
	    }
	    System.out.println("Cantidad de digitos: " + reps);
	    
	    aux = n;
	    reps = reps/2;
	    
	    for (int i = reps; i > 0; i--){
	    	digitsCount *= 10;
	    }
	    
	    System.out.println("Mitad de digitos: " + digitsCount);
	    
	    rest = aux % digitsCount;
	    aux = aux / digitsCount;
	    
	    while (aux > 0){
	        totalSum1 += aux % 10;
	        aux /= 10;
	    }
	    
	    while (rest > 0){
	        totalSum2 += rest % 10;
	        rest /= 10;
	    }
	    
	    if (totalSum1 == totalSum2){
	        return true;
	    }
	    else{
	        return false;
	    }   
	}
	
	int[] sortByHeight(int[] a) {
	    
	    int[] orderedHeight = new int[a.length];
	    int min = Integer.MAX_VALUE;
	    int max = a[0];
	    int height;
	    
	    for (int i = 0; i < a.length; i++){
	    	if (a[i] > max){
	    		max = a[i];
	    	}
	    	
	    	if (a[i] > -1 && a[i] < min) {
	    		min = a[i];
	    	}
	    	
	    	if (a[i] == -1) {
	    		orderedHeight[i] = a[i];
	    	}
	    }	    
	    
	    int j = 0;
	    
	    for (height = min; height <= max; height++){
	    	for (int i = 0; i < a.length; i++){
	    		if (height == a[i]){
	    			while (orderedHeight[j] == -1){
	    				j++;
	    			}
	    			orderedHeight[j] = height;
	    			j++;
	    		}
	    	}
	    }
	    
	    return orderedHeight;
	}
	
	String reverseParentheses(String s) {
	    
		Stack<Character> stack = new Stack<Character>();
		StringBuilder build = new StringBuilder();
		char current;
		char currentInner;
		char currentPop = ' ';
		
		for (int i = 0; i < s.length(); i++){
			
			current = s.charAt(i);
			
			System.out.println("Caracter actual " + current);
						
			if (current == ')'){
				System.out.println("Encontrado ')' popeando para invertir... ");
				currentPop = stack.pop();
				System.out.println("Current pop: " + currentPop);
				build.append(currentPop);
				while (!stack.isEmpty()){
					currentPop = stack.pop();
					System.out.println("Current pop: " + currentPop);
					if (currentPop == '('){
						System.out.println("Encontrado '(', retomando...");
						break;
					}
					else{
						build.append(currentPop);
					}
				}
				System.out.println("Append: " + build);
				for (int j = 0; j < build.length(); j++){
					currentInner = build.charAt(j);
					System.out.println("--> Current inner : " + currentInner);
					stack.push(currentInner);
					System.out.println("--> Pusheado " + currentInner);
				}
				build.delete(0, build.length());
			}
			else{
				stack.push(current);
				System.out.println("Pusheando...");
				System.out.println(stack.peek());
			}
			
		}
		
		build.delete(0, build.length());
		
		while (!stack.empty()){
			build.append(stack.pop());
		}
		
		build.reverse();
		
		return build.toString();
	}
	
	int[] alternatingSums(int[] a) {
		int[] sums = {0,0};
	
		for (int i = 0; i < a.length; i++){
			if (i % 2 == 0){
				sums[0] += a[i];
			}
			else{
				sums[1] += a[i];
			}
		}	
		return sums;
	}
	
	String[] addBorder(String[] picture) {
		String[] withBorder = new String[picture.length+2];
		
		int width = picture[0].length()+2;
		int height = picture.length+2;
		String ast = "";
		
		for (int i = 0; i < width; i++){
			ast += "*";
		}
		
		for (int i = 1; i < height -1; i++){
			withBorder[i] = "*";
		}
		
		withBorder[0] = ast;
		withBorder[height-1] = ast;
		
		for (int i = 1; i < height - 1 ; i++){
			withBorder[i] += picture[i-1];
			withBorder[i] += "*";
		}
				
		return withBorder;
		
	}
	
	int nextSquare(int n) {
	    boolean isNextSquare = false;
	    int nextSquare = 0;
	    int i = 0;
	    while (!isNextSquare){
	    	i++;	    	
	    	nextSquare = (int)Math.pow(i, 2);
	    	
	    	if (nextSquare > n){
	    		isNextSquare = true;
	    	}
	    }
		
	    return nextSquare;

	}
	
	boolean areSimilar(int[] a, int[] b) {
		
		int aux = -1;
		int strikeout = 0;
		
		if (!Arrays.equals(a, b)){
			for (int i = 0; i < a.length; i++){
				System.out.println("I vale:" + i);
				System.out.println("Comparo " + a[i] + " con " + b[i]);
				
				if (a[i] != b[i] && aux != -1){
					int aux2 = 0;
					aux2 = b[aux];
					b[aux] = b[i];
					b[i] = aux2;

				}
				
				if (a[i] != b[i] && aux == -1 && strikeout == 2){
					return false;
				}
				
				if (a[i] != b[i] && aux == -1 && strikeout == 0){
					aux = i;
					strikeout++;
				}
				
				for (int j = 0; j<a.length;j++){
					System.out.print(a[j]+", ");
				}
				System.out.println();
				for (int j = 0; j<b.length;j++){
					System.out.print(b[j]+", ");
				}
				System.out.println();
								
			}
			
			return true;
		}
		else{
			return true;
		}
		
	}


}

//revTemp.delete(0, revTemp.charAt(revTemp.length()-1));

