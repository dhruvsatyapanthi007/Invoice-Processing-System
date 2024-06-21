import React, { useState } from "react";
import Header from "../components/Header";
import { Box, Button, Typography } from "@mui/material";
import AddInvoice from "../components/AddInvoice";

const Home = () => {
	const [addInvoice, setAddInvoice] = useState(false);
	const toggleInvoice = () => {
		setAddInvoice(true);
	};
	return (
		<div>
			<Header />
			<Box style={{ margin: 20 }}>
				<Typography variant="h4">Pending invoices</Typography>
				{!addInvoice && (
					<Button
						variant="contained"
						style={{ marginTop: 15 }}
						onClick={() => toggleInvoice()}>
						Add Invoice
					</Button>
				)}
			</Box>
			{addInvoice && <AddInvoice />}
		</div>
	);
};

export default Home;
