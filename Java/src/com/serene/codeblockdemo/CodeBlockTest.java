package com.serene.codeblockdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class CodeBlockTest {
    public static void main(String[] args) {
        {
            System.out.println("局部代码块，块结束即销毁。");
        }

        ConstructorCodeBlock constructorCodeBlock1 = new ConstructorCodeBlock();
        ConstructorCodeBlock constructorCodeBlock2 = new ConstructorCodeBlock("001", "Li Si", 25);

        StaticCodeBlock staticCodeBlock1 = new StaticCodeBlock();
        StaticCodeBlock staticCodeBlock2 = new StaticCodeBlock("002", "Zhang San", 18);

    }

}
