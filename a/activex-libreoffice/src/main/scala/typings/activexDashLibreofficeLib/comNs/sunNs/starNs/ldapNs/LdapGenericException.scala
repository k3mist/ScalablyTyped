package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ldapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic exception occurring during access to an LDAP server. The actual LDAP error code is provided for more refined error management.
  * @since OOo 1.1.2
  */
trait LdapGenericException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** LDAP error code, see LDAP SDK documentation for complete list of possible values and their meaning. */
  var ErrorCode: scala.Double
}

object LdapGenericException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrorCode: scala.Double,
    Message: java.lang.String
  ): LdapGenericException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrorCode = ErrorCode, Message = Message)
  
    __obj.asInstanceOf[LdapGenericException]
  }
}

