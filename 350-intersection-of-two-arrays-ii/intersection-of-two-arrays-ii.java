class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    int count [] = new int[1001];
    for(int i = 0;i<nums1.length;i++){
        count[nums1[i]]++;
    }
    int temp[] = new int[nums2.length];
    int ginnewala = 0;
    for(int j = 0;j<nums2.length;j++){
        if(count[nums2[j]] > 0){
            temp[ginnewala] = nums2[j];
            ginnewala++;
            count[nums2[j]]--;
        }
    }
    int result[] = new int[ginnewala];
    for(int m = 0;m<ginnewala;m++){
        result[m] = temp[m];
    } 
    return result;
    }
}