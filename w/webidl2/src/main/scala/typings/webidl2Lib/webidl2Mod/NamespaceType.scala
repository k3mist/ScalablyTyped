package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An array of namespace members (attributes, operations). Empty if there are none. */
  var members: js.Array[IDLNamespaceMemberType]
  /** The enum's name. */
  var name: java.lang.String
  /** A boolean indicating whether it's a partial namespace. */
  var partial: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.namespace
}

