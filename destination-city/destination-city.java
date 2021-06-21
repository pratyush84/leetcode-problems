class Solution {
    public String destCity(List<List<String>> paths) {
        
        Set<String> sourceSet = new HashSet<>();
        Set<String> destSet = new HashSet<>();
        
        for(List<String> pair: paths){
            sourceSet.add(pair.get(0));
            destSet.add(pair.get(1));
        }
        
        destSet.removeAll(sourceSet);
        return destSet.stream().findFirst().get();
    }
}