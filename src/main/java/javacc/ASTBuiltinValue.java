/* Generated By:JJTree: Do not edit this line. ASTBuiltinValue.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTBuiltinValue extends SimpleNode {
  public ASTBuiltinValue(int id) {
    super(id);
  }

  public ASTBuiltinValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=25eef4587cdb8f50ceec61c6e362d475 (do not edit this line) */
