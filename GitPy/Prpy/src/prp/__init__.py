'''
Created on 11/ago/2014

@author: EUL1128
'''

import clsPersona
import wx
from test.test_mutants import Parent

class app_wx(wx.Frame):
    def __init__(self,parent,id,title):
        wx.Frame.__init__(self,parent,id,title)
        self.parent = parent
        self.inizialize()
        
    def inizialize(self):
        sizer = wx.GridBagSizer()
        self.label=wx.StaticText(self,-1, Persona1.Cognome)
        sizer.Add(self.label,(1,0),(1,2),wx.EXPAND)
        self.SetSizerAndFit(sizer)
        self.Show(True)
        
if __name__=="__main__":
    Persona1 = clsPersona.Persona("Raseni", "Renzo");
    app=wx.App()
    frame = app_wx(None, -1,"my app")
    app.MainLoop()









