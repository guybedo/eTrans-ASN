/* Generated By:JJTree: Do not edit this line. ASTAssignmentList.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTAssignmentList extends SimpleNode {
  public ASTAssignmentList(int id) {
    super(id);
  }

  public ASTAssignmentList(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9f4b4602e2a78b5760a6c25413c7e4a0 (do not edit this line) */
