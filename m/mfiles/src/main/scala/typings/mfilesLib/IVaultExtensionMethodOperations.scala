package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultExtensionMethodOperations extends js.Object {
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: java.lang.String): scala.Boolean
  def ExecuteVaultExtensionMethod(MethodIdentifier: java.lang.String, Input: java.lang.String): java.lang.String
}

object IVaultExtensionMethodOperations {
  @scala.inline
  def apply(
    DoesActiveVaultExtensionMethodExist: js.Function1[java.lang.String, scala.Boolean],
    ExecuteVaultExtensionMethod: js.Function2[java.lang.String, java.lang.String, java.lang.String]
  ): IVaultExtensionMethodOperations = {
    val __obj = js.Dynamic.literal(DoesActiveVaultExtensionMethodExist = DoesActiveVaultExtensionMethodExist, ExecuteVaultExtensionMethod = ExecuteVaultExtensionMethod)
  
    __obj.asInstanceOf[IVaultExtensionMethodOperations]
  }
}

