/* Generated By:JJTree: Do not edit this line. ASTSignedNumber.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTSignedNumber extends SimpleNode {
  public ASTSignedNumber(int id) {
    super(id);
  }

  public ASTSignedNumber(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fac5ebe810c886d1b2c1ee72999f1c8f (do not edit this line) */
