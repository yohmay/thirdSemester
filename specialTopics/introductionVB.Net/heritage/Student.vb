Public Class Student Inherits Person

    Private Registration As String
    
    Sub New(ByVal name As String, ByVal Registration As String, ByVal document As String)
        Me.pname = name
        Me.pdocument = document
        Me.pregistration = Registration
    End Sub

    Property pregistration() As String
        Get
            Return Registration
        End Get
        Set(ByVal value As String)
            Registration = value
        End Set
    End Property
End Class
