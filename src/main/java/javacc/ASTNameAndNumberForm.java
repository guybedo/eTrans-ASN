/* Generated By:JJTree: Do not edit this line. ASTNameAndNumberForm.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTNameAndNumberForm extends SimpleNode {
  public ASTNameAndNumberForm(int id) {
    super(id);
  }

  public ASTNameAndNumberForm(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c01bb909fe05c0750808b048d40b4b9f (do not edit this line) */
