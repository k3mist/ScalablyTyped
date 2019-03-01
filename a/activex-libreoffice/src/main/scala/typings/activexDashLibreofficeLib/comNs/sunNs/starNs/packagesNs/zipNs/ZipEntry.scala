package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to represent a ZIP file entry
  *
  * This interface is an IDL version of the Java interface **java.util.zip.ZipFile** with some minor adaptations.
  */
trait ZipEntry extends js.Object {
  /** optional extra field data for entry */
  var extra: activexDashInteropLib.SafeArray[scala.Double]
  /** uncompressed size of entry data */
  var nCompressedSize: scala.Double
  /** CRC-32 of entry data */
  var nCrc: scala.Double
  /** The number of the disk this entry is saved on */
  var nDiskNumber: scala.Double
  /** bit flags */
  var nFlag: scala.Double
  /** compression method */
  var nMethod: scala.Double
  /** offset of LOC header */
  var nOffset: scala.Double
  /** uncompressed size of entry data */
  var nSize: scala.Double
  /** modification time */
  var nTime: scala.Double
  /** version needed to extract */
  var nVersion: scala.Double
  /** optional comment */
  var sComment: java.lang.String
  /** the entry name */
  var sName: java.lang.String
}

object ZipEntry {
  @scala.inline
  def apply(
    extra: activexDashInteropLib.SafeArray[scala.Double],
    nCompressedSize: scala.Double,
    nCrc: scala.Double,
    nDiskNumber: scala.Double,
    nFlag: scala.Double,
    nMethod: scala.Double,
    nOffset: scala.Double,
    nSize: scala.Double,
    nTime: scala.Double,
    nVersion: scala.Double,
    sComment: java.lang.String,
    sName: java.lang.String
  ): ZipEntry = {
    val __obj = js.Dynamic.literal(extra = extra, nCompressedSize = nCompressedSize, nCrc = nCrc, nDiskNumber = nDiskNumber, nFlag = nFlag, nMethod = nMethod, nOffset = nOffset, nSize = nSize, nTime = nTime, nVersion = nVersion, sComment = sComment, sName = sName)
  
    __obj.asInstanceOf[ZipEntry]
  }
}

