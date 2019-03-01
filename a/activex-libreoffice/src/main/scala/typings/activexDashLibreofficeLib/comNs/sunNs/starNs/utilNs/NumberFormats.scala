package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a container of number formats. */
trait NumberFormats
  extends XNumberFormats
     with XNumberFormatTypes

object NumberFormats {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addNew: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double
    ],
    addNewConverted: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double
    ],
    generateFormat: js.Function6[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Double, 
      scala.Double, 
      java.lang.String
    ],
    getByKey: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getFormatForLocale: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double
    ],
    getFormatIndex: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double
    ],
    getStandardFormat: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double
    ],
    getStandardIndex: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double],
    isTypeCompatible: js.Function2[scala.Double, scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryKey: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      scala.Double
    ],
    queryKeys: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    release: js.Function0[scala.Unit],
    removeByKey: js.Function1[scala.Double, scala.Unit]
  ): NumberFormats = {
    val __obj = js.Dynamic.literal(acquire = acquire, addNew = addNew, addNewConverted = addNewConverted, generateFormat = generateFormat, getByKey = getByKey, getFormatForLocale = getFormatForLocale, getFormatIndex = getFormatIndex, getStandardFormat = getStandardFormat, getStandardIndex = getStandardIndex, isTypeCompatible = isTypeCompatible, queryInterface = queryInterface, queryKey = queryKey, queryKeys = queryKeys, release = release, removeByKey = removeByKey)
  
    __obj.asInstanceOf[NumberFormats]
  }
}

