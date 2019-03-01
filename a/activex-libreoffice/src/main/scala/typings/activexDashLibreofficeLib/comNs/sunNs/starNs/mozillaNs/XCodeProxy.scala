package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface to run Mozilla XPCOM code to run Mozilla XPCOM code in OOo,you should first implement this interface, then pass this object to
  * xProxyRunner->Run
  * @see XProxyRunner
  * @see XMozillaBootstrap
  */
trait XCodeProxy
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** which Mozilla product this code is write for */
  val ProductType: MozillaProductType
  /** which Mozilla profile this code will use */
  val ProfileName: java.lang.String
  /** which Mozilla product this code is write for */
  def getProductType(): MozillaProductType
  /** which Mozilla profile this code will use */
  def getProfileName(): java.lang.String
  /** all Mozilla XPCOM code must be called in {@link run()} or functions called by {@link run()} */
  def run(): scala.Double
}

object XCodeProxy {
  @scala.inline
  def apply(
    ProductType: MozillaProductType,
    ProfileName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getProductType: js.Function0[MozillaProductType],
    getProfileName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    run: js.Function0[scala.Double]
  ): XCodeProxy = {
    val __obj = js.Dynamic.literal(ProductType = ProductType, ProfileName = ProfileName, acquire = acquire, getProductType = getProductType, getProfileName = getProfileName, queryInterface = queryInterface, release = release, run = run)
  
    __obj.asInstanceOf[XCodeProxy]
  }
}

