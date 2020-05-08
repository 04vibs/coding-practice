
function findMergeNode(headA, headB) {

    let runner1 = headA;
    let runner2 = headB;

    if(headA == null && headB == null) {
        return null;
    }
    while(runner1 !== runner2){

    if(runner1 == null) {
        runner1 = headB;
    }else {
        runner1 = runner1.next;
    }
    if(runner2 == null) {
        runner2 = headA;
    }else {
        runner2 = runner2.next;
    }
    }
    return runner1.data;
}
