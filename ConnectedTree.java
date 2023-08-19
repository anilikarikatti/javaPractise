import java.util.*;

class MakeNode{
    String node;
    ArrayList<String> children = new ArrayList<String>();
    boolean root ;

    MakeNode(String node,ArrayList<String> children ,boolean root){
      this.node = node ;
       this.children = children ;
       this.root = root;
    }

    public String getNode(){
        System.out.println(this.node + " node");
        return this.node;
    }

    public String toString(){
       String str = this.node + "";
    //    System.out.println(str);
       return str;
    }

    // public void 
}
 class ConnectedTree{
    public static void main(String args[]){

        // double arr[];
        // int [] arr1;

        // short arr2 [] = new short[10];

        // arr2[0] = 10;
        // short num = 10;
        // for(short a : arr2){
        //     num +=1;
        //     a =  num;
            
        //     System.out.println(a);

        // }

        // String input [][] = {{'a','b'},{'b','c'},{'a','d'},{'b','d'},{'f','e'}};

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter input ");

        String inputData = scanner.nextLine();

        System.out.println(inputData);

        String arr[] = inputData.split(" ");

        String input[][] = new String[4][2];
        

           
        // System.out.println(arr);

        for(short i=0;i<arr.length ; i++){
                String arr1[] = arr[i].split("");
             
              for(short j=0;j<arr1.length ; j++){
               input[i][j] = arr1[j]; 

        }

        }

        
        for(String c[] : input){
            System.out.println(Arrays.toString(c));
        }



           

        ArrayList<MakeNode> nodes =  ConstructTree(input);

        ArrayList<Boolean> connectedCount = CheckConnectedTreeOrNot(nodes);
        
            // System.out.println(connectedCount.size() + " "+nodes.size());

        result(nodes,connectedCount);

        
    }

    public static  ArrayList<MakeNode> ConstructTree(String input[][]){

            ArrayList<MakeNode> nodes = new ArrayList<MakeNode>();

             for(short i=0;i<input.length ; i++){
                ArrayList<String> arr = new ArrayList<String>();

               arr.add(input[i][1]);
                boolean flag = true;
               for(MakeNode a : nodes){
                    if(a.node == input[i][0]){
                        a.children.add(input[i][1]);
                        flag = false;
                    }
                }

                boolean root = i == 0 ? true : false;
                if(flag){

                    MakeNode node  = new MakeNode(input[i][0],arr,root);
                    // String nodeName =  node.getNode();
                   String nodeName =  node.toString();

                    nodes.add(node);
                    System.out.println(nodeName);
                }
         }
         return nodes;
        }


        public static ArrayList<Boolean> CheckConnectedTreeOrNot(ArrayList<MakeNode> nodes){
            ArrayList<Boolean> connectedCount = new ArrayList<Boolean>();
          for(MakeNode a : nodes){
                boolean flag = true;
             if(!a.root ){

            for(MakeNode node : nodes){


                for(String children : node.children){
                            // System.out.println(children.equals(a.node) + " " + a.node + " " + children );
                            // System.out.println(children == a.node + " " + a.node + " " + children  );


                       if(a.node.equals(children)){
                            flag = false;
                            break;
                       }
                    }
                }

                if(!flag){
                    connectedCount.add(true);
                }

            }
          }
          return connectedCount;
        }

        public static void result(ArrayList<MakeNode> nodes , ArrayList<Boolean> connectedCount){

            System.out.println(connectedCount);
            if(nodes.size()-1 == connectedCount.size()){
                System.out.println("connected tree");
            }
            else{
                System.out.println("not connected tree");
            }
        }

}