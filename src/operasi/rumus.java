package operasi;

public class rumus {

        public static int luasPersegi(int s) {

            return s * s;
        }

        public static int luasSegitiga(int a, int t) {

            return (a*t)/2;
        }

        public static int luaspersegiPanjang(int p, int l) {

            return p * l;
        }

        public static int kelilingPersegi(int s) {

            return s*4;
        }

        public static int kelilingSegitiga(int a, int t) {
            double k = Math.sqrt(Math.pow((a/2),2) + Math.pow(t, 2));
            return (int) (Math.ceil(a+2*k));
        }

        public static int kelilingpersegiPanjang(int p, int l) {

            return 2*(p+l);
        }

        public static int volumeKubus(int s) {

            return s*s*s;
        }

        public static int volumeBalok(int p, int l, int t) {

            return p*l*t;
        }

        public static int volumeTabung(int r, int t) {

            return (int) (Math.ceil(Math.PI * r * r * t));
        }

}
