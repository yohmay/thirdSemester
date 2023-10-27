Public Class Teacher Inherits Person

    Private Title As String
    
    Sub New(ByVal name As String, ByVal Title As String, ByVal document As String)
        Me.pname = name
        Me.pdocument = document
        Me.ptitle = Title
    End Sub

    Property ptitle() As String
        Get
            Return Title
        End Get
        Set(ByVal value As String)
            Title = value
        End Set
    End Property
End Class