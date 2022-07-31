package link_list;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(22,1.9);
        linkList.insertFirst(4,78.2);
        linkList.insertFirst(7,34.0);
        linkList.insertFirst(12,2.99);

        linkList.displayList();

        while(!linkList.isEmpty()){
            Link aLink = linkList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        linkList.displayList();

        linkList.insertFirst(99,7.9);
        linkList.insertFirst(1,8.55);
        linkList.insertFirst(7,388.2);
        linkList.insertFirst(82,0.99);

        linkList.displayList();

        Link f = linkList.find(7);
        if(f != null) System.out.println("Found link with key " + f.iData);
        else System.out.println("Can't find link");

        Link d = linkList.delete(82);
        if(d != null) System.out.println("Delete link with key " + d.dData);
        else System.out.println("Can't delete link");

        linkList.displayList();
    }
}
