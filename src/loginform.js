function Form() {
  return (
    <div className="App">
      <header className="App-header">
         <div>
            <form>
                <h3 align="center">LOGIN PAGE</h3>
                <table align="center" cellspacing="20px">
                    <tr>
                        <td><input type="email" placeholder="email"></input></td>
                    </tr>
                    <tr>
                        <td><input type="text" placeholder="password"></input></td>
                    </tr>
                    <tr>
                        <td><button align="center" type="submit" >Login</button></td>
                    </tr>
                </table>  
            </form>
        </div>
      </header>
    </div>
  );
}
export default Form;