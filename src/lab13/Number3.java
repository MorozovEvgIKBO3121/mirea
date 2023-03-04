package lab13;


    public class Number3 {
        public static void main(String[] args) {
            String addressString1 = "Russia, Moscow Oblast, Moscow, Tverskaya Street, 1, 2, 3";
            Address address1 = Address.parseAddress(addressString1);
            System.out.println(address1);

            String addressString2 = "USA; California; San Francisco; Market Street; 100; ; 10";
            Address address2 = Address.parseAddressUsingTokenizer(addressString2);
            System.out.println(address2);

            String addressString3 = "UK. England. London. Oxford Street. 10. 1. 20";
            Address address3 = Address.parseAddressUsingTokenizer(addressString3);
            System.out.println(address3);

            String addressString4 = "France, Ile-de-France, Paris, Champs-Elysees. 1 ; 15, 20";
            Address address4 = Address.parseAddressUsingTokenizer(addressString4);
            System.out.println(address4);
        }


    }



