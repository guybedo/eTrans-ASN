/* Generated By:JJTree: Do not edit this line. ASTEnumerationList.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTEnumerationList extends SimpleNode {
  public ASTEnumerationList(int id) {
    super(id);
  }

  public ASTEnumerationList(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=69adc28a138b992f8888f7a6433866f8 (do not edit this line) */
