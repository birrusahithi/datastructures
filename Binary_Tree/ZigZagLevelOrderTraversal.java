public class ZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Deque <TreeNode> que = new LinkedList<>();
        que.add(root);
        int level =0;
        while(!que.isEmpty()){
            list.add(new ArrayList<Integer>());
            int size = que.size();
            for(int i=0; i<size; i++){
                TreeNode temp;
                if(level%2==0){
                    temp = que.removeFirst();
                    list.get(level).add(temp.val);
                }else{
                    temp = que.removeLast();
                    list.get(level).add(temp.val);
                }
                if(level%2==0){
                    if(temp.left!=null){
                        que.add(temp.left);
                    }
                    if(temp.right!=null){
                        que.add(temp.right);
                    }
                }else{
                    if(temp.right!=null){
                        que.addFirst(temp.right);
                    }
                    if(temp.left!=null){
                        que.addFirst(temp.left);
                    }
                }
            }
            level++;
        }
        return list;
    }
}
