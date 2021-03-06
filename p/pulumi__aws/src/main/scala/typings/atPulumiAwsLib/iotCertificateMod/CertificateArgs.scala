package typings
package atPulumiAwsLib.iotCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateArgs extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  /**
    * The certificate signing request. Review the
    * [IoT API Reference Guide] (http://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on creating a certificate from a certificate signing request (CSR).
    */
  val csr: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object CertificateArgs {
  @scala.inline
  def apply(
    active: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    csr: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): CertificateArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateArgs]
  }
}

