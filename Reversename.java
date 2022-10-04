class Reversename {
      public static void main(String args[] ) {
        StringBuilder sb= new StringBuilder("Dhvanik");
        for (int i=0; i< sb.length()/2; i++ ) {
            char frontchar= sb.charAt(i);
            char backchar=sb.charAt(sb.length()-1-i);
            sb.setCharAt(i, backchar);
            sb.setCharAt(sb.length()-1-i, frontchar);
            
        }
        System.out.println(sb);

      }


}