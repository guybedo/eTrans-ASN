/* Generated By:JJTree: Do not edit this line. ASTSubtypeValueSetList.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTSubtypeValueSetList extends SimpleNode {
  public ASTSubtypeValueSetList(int id) {
    super(id);
  }

  public ASTSubtypeValueSetList(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1ad8644e90f6d4206f0952f7083454b1 (do not edit this line) */
