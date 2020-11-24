//not given access to head but only node to deleted, guarenteed said node
//is not tail node
class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        ListNode temp = node.next; 
        node.next=node.next.next;
    }
}