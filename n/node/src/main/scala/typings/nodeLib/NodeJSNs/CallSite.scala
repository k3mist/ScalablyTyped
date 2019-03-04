package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
  /**
    * Current column number [if this function was defined in a script]
    */
  def getColumnNumber(): scala.Double | scala.Null
  /**
    * A call site object representing the location where eval was called
    * [if this function was created using a call to eval]
    */
  def getEvalOrigin(): js.UndefOr[java.lang.String]
  /**
    * Name of the script [if this function was defined in a script]
    */
  def getFileName(): java.lang.String | scala.Null
  /**
    * Current function
    */
  def getFunction(): js.UndefOr[js.Function]
  /**
    * Name of the current function, typically its name property.
    * If a name property is not available an attempt will be made to try
    * to infer a name from the function's context.
    */
  def getFunctionName(): java.lang.String | scala.Null
  /**
    * Current line number [if this function was defined in a script]
    */
  def getLineNumber(): scala.Double | scala.Null
  /**
    * Name of the property [of "this" or one of its prototypes] that holds
    * the current function
    */
  def getMethodName(): java.lang.String | scala.Null
  /**
    * Value of "this"
    */
  def getThis(): js.Any
  /**
    * Type of "this" as a string.
    * This is the name of the function stored in the constructor field of
    * "this", if available.  Otherwise the object's [[Class]] internal
    * property.
    */
  def getTypeName(): java.lang.String | scala.Null
  /**
    * Is this a constructor call?
    */
  def isConstructor(): scala.Boolean
  /**
    * Does this call take place in code defined by a call to eval?
    */
  def isEval(): scala.Boolean
  /**
    * Is this call in native V8 code?
    */
  def isNative(): scala.Boolean
  /**
    * Is this a toplevel invocation, that is, is "this" the global object?
    */
  def isToplevel(): scala.Boolean
}

object CallSite {
  @scala.inline
  def apply(
    getColumnNumber: () => scala.Double | scala.Null,
    getEvalOrigin: () => js.UndefOr[java.lang.String],
    getFileName: () => java.lang.String | scala.Null,
    getFunction: () => js.UndefOr[js.Function],
    getFunctionName: () => java.lang.String | scala.Null,
    getLineNumber: () => scala.Double | scala.Null,
    getMethodName: () => java.lang.String | scala.Null,
    getThis: () => js.Any,
    getTypeName: () => java.lang.String | scala.Null,
    isConstructor: () => scala.Boolean,
    isEval: () => scala.Boolean,
    isNative: () => scala.Boolean,
    isToplevel: () => scala.Boolean
  ): CallSite = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
  
    __obj.asInstanceOf[CallSite]
  }
}

