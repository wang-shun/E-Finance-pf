/*    */ package com.infosight.open.api.utils;
/*    */ 
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import org.apache.commons.codec.digest.DigestUtils;
/*    */ 
/*    */ public class MD5
/*    */ {
/*    */   public static String sign(String text, String key, String input_charset)
/*    */   {
/* 26 */     text = text + key;
/* 27 */     return DigestUtils.md5Hex(getContentBytes(text, input_charset));
/*    */   }
/*    */ 
/*    */   public static boolean verify(String text, String sign, String key, String input_charset)
/*    */   {
/* 39 */     text = text + key;
/* 40 */     String mysign = DigestUtils.md5Hex(getContentBytes(text, input_charset));
/*    */ 
/* 42 */     return mysign.equals(sign);
/*    */   }
/*    */ 
/*    */   private static byte[] getContentBytes(String content, String charset)
/*    */   {
/* 57 */     if ((charset == null) || ("".equals(charset)))
/* 58 */       return content.getBytes();
/*    */     try
/*    */     {
/* 61 */       return content.getBytes(charset); } catch (UnsupportedEncodingException e) {
/*    */     }
/* 63 */     throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
/*    */   }
/*    */ }

/* Location:           C:\Users\Administrator\Desktop\shanqb-sdk-1.0.jar
 * Qualified Name:     com.infosight.open.api.utils.MD5
 * JD-Core Version:    0.6.0
 */