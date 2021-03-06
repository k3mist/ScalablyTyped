package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedLinkPublicOperations extends js.Object {
  def DownloadSharedFileInBlocks_Begin(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: INamedValues): IFileDownloadSession
  def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: INamedValues): IFileDownloadSession
  def DownloadSharedFileInBlocks_ReadBlock(
    VaultGUID: java.lang.String,
    AccessKey: java.lang.String,
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double
  ): js.Array[scala.Double]
  def DownloadSharedFileInBlocks_ReadBlock_32bit(
    VaultGUID: java.lang.String,
    AccessKey: java.lang.String,
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double
  ): js.Array[scala.Double]
  def GetSharedLinkInfo(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: INamedValues): ISharedFileInfo
}

object ISharedLinkPublicOperations {
  @scala.inline
  def apply(
    DownloadSharedFileInBlocks_Begin: (java.lang.String, java.lang.String, INamedValues) => IFileDownloadSession,
    DownloadSharedFileInBlocks_Begin_32bit: (java.lang.String, java.lang.String, INamedValues) => IFileDownloadSession,
    DownloadSharedFileInBlocks_ReadBlock: (java.lang.String, java.lang.String, scala.Double, scala.Double, scala.Double) => js.Array[scala.Double],
    DownloadSharedFileInBlocks_ReadBlock_32bit: (java.lang.String, java.lang.String, scala.Double, scala.Double, scala.Double) => js.Array[scala.Double],
    GetSharedLinkInfo: (java.lang.String, java.lang.String, INamedValues) => ISharedFileInfo
  ): ISharedLinkPublicOperations = {
    val __obj = js.Dynamic.literal(DownloadSharedFileInBlocks_Begin = js.Any.fromFunction3(DownloadSharedFileInBlocks_Begin), DownloadSharedFileInBlocks_Begin_32bit = js.Any.fromFunction3(DownloadSharedFileInBlocks_Begin_32bit), DownloadSharedFileInBlocks_ReadBlock = js.Any.fromFunction5(DownloadSharedFileInBlocks_ReadBlock), DownloadSharedFileInBlocks_ReadBlock_32bit = js.Any.fromFunction5(DownloadSharedFileInBlocks_ReadBlock_32bit), GetSharedLinkInfo = js.Any.fromFunction3(GetSharedLinkInfo))
  
    __obj.asInstanceOf[ISharedLinkPublicOperations]
  }
}

