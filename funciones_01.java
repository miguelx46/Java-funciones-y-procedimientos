boolean a = par_impar(3);
        System.out.println(a);
        tabla (5);

        int v[] = {7,2,4,6,10};
        int B2[] = new int[v.length];

        int b;

        b = mayor(v);
        System.out.println("Numero mayor =" +b);

        int A[] = {1,2,3,4,5};
        int c = suma(A);
        System.out.println("La suma de los elementos es " +c);

        int D[] = {1,7,8,2,5};
        int numE = 1;
        boolean var1;
        var1 = esta_en_vector(D, numE);
    }
    //Aquí van a estar los procedimientos y las funciones

    //Función tabla
    public static boolean par_impar (int num){
        return num % 2 == 0;
    }

    //Procedimiento tabla
    public static void tabla (int num2){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ "*" +num2+ "=" +i*num2);
        }
    }
    //Función mayor
    public static int mayor(int v[]){
        int mayor = -999999999;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > mayor) {
                mayor = v[i];
            }
        }
        return mayor;
    }
    //Función suma
    public static int suma(int A[]) {
        int suma = 0;
        for (int i = 0; i < A.length; i++) {
            suma = A[i] + suma;

        }
        return suma;
    }
    //Función vector inverso
    public static int[] inverso(int v[]) {
    int B2[] = new int[v.length];
    int j = 0;
       for (int i = v.length - 1 ; i >= 0; i--) {
           B2[j] = v[i];
           j++;
       }
       return B2;
    }


    //Procedimiento media de elementos
    public static void media(int C[]) {
        int sum = 0;
        for (int i = 0; i < C.length; i++) {
            sum = sum + C[i];
        }
        sum = sum/C.length;
        System.out.println(sum);
    }
    //Función está el número
    public static boolean esta_en_vector(int D[], int numE) {
        boolean esta = false;
        for (int i = 1; i <= D.length; i++) {
            if(D[i] == numE) {
                esta = true;
            }
        }
        return esta;
    }
