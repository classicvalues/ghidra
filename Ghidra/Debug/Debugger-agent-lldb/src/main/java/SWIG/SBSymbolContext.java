/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
package SWIG;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class SBSymbolContext {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBSymbolContext(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBSymbolContext obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lldbJNI.delete_SBSymbolContext(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBSymbolContext() {
    this(lldbJNI.new_SBSymbolContext__SWIG_0(), true);
  }

  public SBSymbolContext(SBSymbolContext rhs) {
    this(lldbJNI.new_SBSymbolContext__SWIG_1(SBSymbolContext.getCPtr(rhs), rhs), true);
  }

  public boolean IsValid() {
    return lldbJNI.SBSymbolContext_IsValid(swigCPtr, this);
  }

  public SBModule GetModule() {
    return new SBModule(lldbJNI.SBSymbolContext_GetModule(swigCPtr, this), true);
  }

  public SBCompileUnit GetCompileUnit() {
    return new SBCompileUnit(lldbJNI.SBSymbolContext_GetCompileUnit(swigCPtr, this), true);
  }

  public SBFunction GetFunction() {
    return new SBFunction(lldbJNI.SBSymbolContext_GetFunction(swigCPtr, this), true);
  }

  public SBBlock GetBlock() {
    return new SBBlock(lldbJNI.SBSymbolContext_GetBlock(swigCPtr, this), true);
  }

  public SBLineEntry GetLineEntry() {
    return new SBLineEntry(lldbJNI.SBSymbolContext_GetLineEntry(swigCPtr, this), true);
  }

  public SBSymbol GetSymbol() {
    return new SBSymbol(lldbJNI.SBSymbolContext_GetSymbol(swigCPtr, this), true);
  }

  public void SetModule(SBModule module) {
    lldbJNI.SBSymbolContext_SetModule(swigCPtr, this, SBModule.getCPtr(module), module);
  }

  public void SetCompileUnit(SBCompileUnit compile_unit) {
    lldbJNI.SBSymbolContext_SetCompileUnit(swigCPtr, this, SBCompileUnit.getCPtr(compile_unit), compile_unit);
  }

  public void SetFunction(SBFunction function) {
    lldbJNI.SBSymbolContext_SetFunction(swigCPtr, this, SBFunction.getCPtr(function), function);
  }

  public void SetBlock(SBBlock block) {
    lldbJNI.SBSymbolContext_SetBlock(swigCPtr, this, SBBlock.getCPtr(block), block);
  }

  public void SetLineEntry(SBLineEntry line_entry) {
    lldbJNI.SBSymbolContext_SetLineEntry(swigCPtr, this, SBLineEntry.getCPtr(line_entry), line_entry);
  }

  public void SetSymbol(SBSymbol symbol) {
    lldbJNI.SBSymbolContext_SetSymbol(swigCPtr, this, SBSymbol.getCPtr(symbol), symbol);
  }

  public SBSymbolContext GetParentOfInlinedScope(SBAddress curr_frame_pc, SBAddress parent_frame_addr) {
    return new SBSymbolContext(lldbJNI.SBSymbolContext_GetParentOfInlinedScope(swigCPtr, this, SBAddress.getCPtr(curr_frame_pc), curr_frame_pc, SBAddress.getCPtr(parent_frame_addr), parent_frame_addr), true);
  }

  public boolean GetDescription(SBStream description) {
    return lldbJNI.SBSymbolContext_GetDescription(swigCPtr, this, SBStream.getCPtr(description), description);
  }

  public String __str__() {
    return lldbJNI.SBSymbolContext___str__(swigCPtr, this);
  }

}