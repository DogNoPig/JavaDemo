package test;

/**
 * 测试
 *
 * @author adx
 * @date 2020/8/11 15:12
 */
public class Test {
    public static void main(String[] args) {
        /*String s = "  -, -,新增,修改,删除-, -,新增,修改,删除,审批,修改状态,预览,相片-, -,新增,修改,删除,审批,树控件,修改状态-,新增,修改,删除,修改状态,审批,预览-,新增,修改,删除,审批,修改状态-,新增,修改,删除,审批,修改状态-,新增,修改,删除-,修改,删除,审批,修改状态,预览-,新增,删除,修改,预览,修改状态,审核,水印,批量上传,审批-,新增,修改,删除,审批,修改状态-,新增,修改,删除,树控件,在线播放,审核,修改状态,审批-,新增,修改,删除,审批,树控件,修改状态-,新增,修改,删除-,新增,修改,删除,审批,修改状态,预览-,新增,修改,删除,审批,修改状态-,新增,修改,删除,审批,修改状态-,新增,修改,删除,修改状态,审批-,新增,修改,删除,树控件,修改状态,审批-,新增,修改,删除,树控件,修改状态,审批-,新增,修改,删除-,修改,删除,修改状态,审批-,修改,修改状态,审批-,新增,修改,删除,修改状态,审批-,新增,修改,删除,修改状态,审批-,新增,修改,删除-,审批,修改状态,删除,新增,修改-,新增,修改,删除,修改状态,审批-,新增,修改,删除,修改状态,审批-,新增,修改,删除,审核,修改状态-,新增,修改,删除,修改状态-,审批,修改状态,删除,在线播放-,新增,修改,审批,修改状态-,新增,修改,删除,审批,修改状态-,新增,修改,删除,审批,修改状态-,新增,修改,删除,审批,修改状态-,新增,修改,删除-,删除-,修改,新增,删除-,新增,修改,删除-,新增,修改,删除,修改状态,审批-,新增,修改,删除,修改状态,审批,预览-, -,新增,修改,删除-,新增,修改,删除-,新增,修改,删除,修改状态,审批-,新增,修改,删除,修改状态,审批-,新增,修改,删除,修改状态,审批-,新增,修改,删除,修改状态,审批-, -,新增,修改,删除,修改状态,审批,预览-,新增,修改,删除,修改状态,审批-,修改-,新增,修改,删除-,修改-,审批,删除,预览,修改状态-,预览-,预览,导出-";
        String s1 = "1,4,85,100,101,102,103,104,105,106,107,108,110,111,112,113,114,115,116,119,120,122,123,124,125,126,127,128,130,131,132,133,134,138,139,140,141,143,148,150,151,155,159,160,161,163,164,165,166,167,168,169,170,172,174,175,176,177,178,179,182";
        String ss[] = s.substring(0,s.length() - 1).split("-,");
        String ss1[] = s1.split(",");
        System.out.println("ss1="+ss1.length);
        System.out.println(ss.length);
        System.out.println(ss1[28]);*/
        /*for (int i = 0; i < ss1.length; i++){
            System.out.println(ss[i]);
        }*/
        int baifenhao = baifenhao(13, 5);
        System.out.println(baifenhao);

        int left = left(3,3);
        System.out.println(left);
    }

    /**
     * 计算左移运算 <<
     * 2 = 10 ，8 = 2^3
     * 1向左移3位
     * 10000 = 2^4
     * a * 2 ^ b
     * @param a 基数
     * @param b 位数
     * @return
     */
    public static int left(int a, int b){
        return a << b;
    }

    public static int right(int a, int b){
        return a >> b;
    }

    public static int baifenhao(int a, int b){
        return a % b;
    }
}
