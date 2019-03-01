package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var chunkReason: js.Any
  var debugId: scala.Double
  var entryModule: js.Any
  var extraAsync: scala.Boolean
  var files: js.Array[_]
  var groupsIterable: js.Array[_]
  var hash: js.Any
  var id: js.Any
  var ids: js.Any
  var modulesIterable: js.Array[_]
  var name: js.Any
  var rendered: scala.Boolean
  var renderedHash: js.Any
  def addGroup(chunkGroup: js.Any): scala.Boolean
  def addModule(module: js.Any): scala.Boolean
  def addMultiplierAndOverhead(size: scala.Double, options: js.Any): scala.Double
  def canBeInitial(): scala.Boolean
  def canBeIntegrated(otherChunk: js.Any): scala.Boolean
  def compareTo(otherChunk: js.Any): webpackLib.webpackLibNumbers.`-1` | webpackLib.webpackLibNumbers.`0` | webpackLib.webpackLibNumbers.`1`
  def containsModule(module: js.Any): scala.Boolean
  def getAllAsyncChunks(): nodeLib.Set[_]
  def getChunkMaps(realHash: js.Any): webpackLib.Anon_Hash
  // tslint:disable-next-line:ban-types
  def getChunkModuleMaps(filterFn: js.Function): webpackLib.Anon_HashId
  def getModules(): js.Array[_]
  def getModulesIdent(): js.Array[_]
  def getNumberOfGroups(): scala.Double
  def getNumberOfModules(): scala.Double
  def hasEntryModule(): scala.Boolean
  // tslint:disable-next-line:ban-types
  def hasModuleInGraph(filterFn: js.Function, filterChunkFn: js.Function): scala.Boolean
  def hasRuntime(): scala.Boolean
  def integrate(otherChunk: js.Any, reason: js.Any): scala.Boolean
  def integratedSize(otherChunk: js.Any, options: js.Any): scala.Double
  def isEmpty(): scala.Boolean
  def isInGroup(chunkGroup: js.Any): scala.Boolean
  def isOnlyInitial(): scala.Boolean
  def modulesSize(): scala.Double
  def moveModule(module: js.Any, otherChunk: js.Any): scala.Unit
  def remove(reason: js.Any): scala.Unit
  def removeGroup(chunkGroup: js.Any): scala.Boolean
  def removeModule(module: js.Any): scala.Boolean
  def setModules(modules: js.Any): scala.Unit
  def size(options: js.Any): scala.Double
  // tslint:disable-next-line:ban-types
  def sortModules(sortByFn: js.Function): scala.Unit
  def split(newChunk: js.Any): scala.Unit
  def updateHash(hash: js.Any): scala.Unit
}

object Chunk {
  @scala.inline
  def apply(
    addGroup: js.Function1[js.Any, scala.Boolean],
    addModule: js.Function1[js.Any, scala.Boolean],
    addMultiplierAndOverhead: js.Function2[scala.Double, js.Any, scala.Double],
    canBeInitial: js.Function0[scala.Boolean],
    canBeIntegrated: js.Function1[js.Any, scala.Boolean],
    chunkReason: js.Any,
    compareTo: js.Function1[
      js.Any, 
      webpackLib.webpackLibNumbers.`-1` | webpackLib.webpackLibNumbers.`0` | webpackLib.webpackLibNumbers.`1`
    ],
    containsModule: js.Function1[js.Any, scala.Boolean],
    debugId: scala.Double,
    entryModule: js.Any,
    extraAsync: scala.Boolean,
    files: js.Array[_],
    getAllAsyncChunks: js.Function0[nodeLib.Set[_]],
    getChunkMaps: js.Function1[js.Any, webpackLib.Anon_Hash],
    getChunkModuleMaps: js.Function1[js.Function, webpackLib.Anon_HashId],
    getModules: js.Function0[js.Array[_]],
    getModulesIdent: js.Function0[js.Array[_]],
    getNumberOfGroups: js.Function0[scala.Double],
    getNumberOfModules: js.Function0[scala.Double],
    groupsIterable: js.Array[_],
    hasEntryModule: js.Function0[scala.Boolean],
    hasModuleInGraph: js.Function2[js.Function, js.Function, scala.Boolean],
    hasRuntime: js.Function0[scala.Boolean],
    hash: js.Any,
    id: js.Any,
    ids: js.Any,
    integrate: js.Function2[js.Any, js.Any, scala.Boolean],
    integratedSize: js.Function2[js.Any, js.Any, scala.Double],
    isEmpty: js.Function0[scala.Boolean],
    isInGroup: js.Function1[js.Any, scala.Boolean],
    isOnlyInitial: js.Function0[scala.Boolean],
    modulesIterable: js.Array[_],
    modulesSize: js.Function0[scala.Double],
    moveModule: js.Function2[js.Any, js.Any, scala.Unit],
    name: js.Any,
    remove: js.Function1[js.Any, scala.Unit],
    removeGroup: js.Function1[js.Any, scala.Boolean],
    removeModule: js.Function1[js.Any, scala.Boolean],
    rendered: scala.Boolean,
    renderedHash: js.Any,
    setModules: js.Function1[js.Any, scala.Unit],
    size: js.Function1[js.Any, scala.Double],
    sortModules: js.Function1[js.Function, scala.Unit],
    split: js.Function1[js.Any, scala.Unit],
    toString: js.Function0[java.lang.String],
    updateHash: js.Function1[js.Any, scala.Unit]
  ): Chunk = {
    val __obj = js.Dynamic.literal(addGroup = addGroup, addModule = addModule, addMultiplierAndOverhead = addMultiplierAndOverhead, canBeInitial = canBeInitial, canBeIntegrated = canBeIntegrated, chunkReason = chunkReason, compareTo = compareTo, containsModule = containsModule, debugId = debugId, entryModule = entryModule, extraAsync = extraAsync, files = files, getAllAsyncChunks = getAllAsyncChunks, getChunkMaps = getChunkMaps, getChunkModuleMaps = getChunkModuleMaps, getModules = getModules, getModulesIdent = getModulesIdent, getNumberOfGroups = getNumberOfGroups, getNumberOfModules = getNumberOfModules, groupsIterable = groupsIterable, hasEntryModule = hasEntryModule, hasModuleInGraph = hasModuleInGraph, hasRuntime = hasRuntime, hash = hash, id = id, ids = ids, integrate = integrate, integratedSize = integratedSize, isEmpty = isEmpty, isInGroup = isInGroup, isOnlyInitial = isOnlyInitial, modulesIterable = modulesIterable, modulesSize = modulesSize, moveModule = moveModule, name = name, remove = remove, removeGroup = removeGroup, removeModule = removeModule, rendered = rendered, renderedHash = renderedHash, setModules = setModules, size = size, sortModules = sortModules, split = split, toString = toString, updateHash = updateHash)
  
    __obj.asInstanceOf[Chunk]
  }
}

